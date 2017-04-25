package net.irext.webapi;

import com.google.gson.Gson;
import net.irext.webapi.model.*;
import net.irext.webapi.utils.Constants;
import net.irext.webapi.utils.MD5Digest;
import net.irext.webapi.request.*;
import net.irext.webapi.response.*;
import okhttp3.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Filename:       WebAPIs.java
 * Revised:        Date: 2017-03-30
 * Revision:       Revision: 1.0
 * <p>
 * Description:    HTTP Request initializer
 * <p>
 * Revision log:
 * 2017-03-30: created by strawmanbobi
 */
public class WebAPIs {

    @SuppressWarnings("all")
    private static final String TAG = WebAPIs.class.getSimpleName();

    private static WebAPIs mInstance = null;

    private static final String URL_PREFIX = "http://irext.net/irext";

    private static final String SERVICE_SIGN_IN = "/certificate/admin_login";
    private static final String SERVICE_LIST_CATEGORIES = "/int/list_categories";
    private static final String SERVICE_LIST_BRANDS = "/int/list_brands";
    private static final String SERVICE_LIST_PROVINCES = "/int/list_provinces";
    private static final String SERVICE_LIST_CITIES = "/int/list_cities";
    private static final String SERVICE_LIST_OPERATORS = "/int/list_operators";
    private static final String SERVICE_LIST_INDEXES = "/int/list_indexes";
    private static final String SERVICE_DOWNLOAD_BIN = "/int/download_bin";

    private int adminID;
    private String token;

    private OkHttpClient mHttpClient;

    private WebAPIs() {
        mHttpClient = new OkHttpClient();
    }

    private static void initializeInstance() {
        mInstance = new WebAPIs();
    }

    @SuppressWarnings("unused")
    public static WebAPIs getInstance() {
        if (null == mInstance) {
            initializeInstance();
        }
        return mInstance;
    }

    private String postToServer(String url, String json) throws IOException {
        MediaType JSON
                = MediaType.parse("application/json; charset=utf-8");

        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        Response response = mHttpClient.newCall(request).execute();
        return response.body().string();
    }

    private InputStream postToServerForOctets(String url, String json) throws IOException {
        MediaType JSON
                = MediaType.parse("application/json; charset=utf-8");
        RequestBody body = RequestBody.create(JSON, json);

        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();

        Response response = mHttpClient.newCall(request).execute();
        return response.body().byteStream();
    }

    @SuppressWarnings("unused")
    public Admin signIn(String user_name, String password) {
        String signInURL = URL_PREFIX + SERVICE_SIGN_IN;
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setUser_name(user_name);
        loginRequest.setPassword(MD5Digest.MD5(password));
        String bodyJson = loginRequest.toJson();

        try {
            String response = postToServer(signInURL, bodyJson);
            LoginResponse loginResponse = new Gson().fromJson(response, LoginResponse.class);
            if(loginResponse.getStatus().getCode() == Constants.ERROR_CODE_SUCCESS) {
                Admin admin = loginResponse.getEntity();
                if (0 != admin.getId() && null != admin.getToken()) {
                    adminID = admin.getId();
                    token = admin.getToken();
                }
                return admin;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @SuppressWarnings("unused")
    public List<Category> listCategories(int from, int count) {
        String listCategoriesURL = URL_PREFIX + SERVICE_LIST_CATEGORIES;
        ListCategoriesRequest listCategoriesRequest = new ListCategoriesRequest();
        listCategoriesRequest.setAdmin_id(adminID);
        listCategoriesRequest.setToken(token);
        listCategoriesRequest.setFrom(from);
        listCategoriesRequest.setCount(count);
        String bodyJson = listCategoriesRequest.toJson();

        try {
            String response = postToServer(listCategoriesURL, bodyJson);
            CategoriesResponse categoriesResponse = new Gson().fromJson(response, CategoriesResponse.class);

            if(categoriesResponse.getStatus().getCode() == Constants.ERROR_CODE_SUCCESS) {
                return categoriesResponse.getEntity();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @SuppressWarnings("unused")
    public List<Brand> listBrands(int categoryID, int from, int count) {
        String listBrandsURL = URL_PREFIX + SERVICE_LIST_BRANDS;
        ListBrandsRequest listBrandsRequest = new ListBrandsRequest();
        listBrandsRequest.setAdmin_id(adminID);
        listBrandsRequest.setToken(token);
        listBrandsRequest.setCategory_id(categoryID);
        listBrandsRequest.setFrom(from);
        listBrandsRequest.setCount(count);
        String bodyJson = listBrandsRequest.toJson();

        try {
            String response = postToServer(listBrandsURL, bodyJson);
            BrandsResponse brandsResponse = new Gson().fromJson(response, BrandsResponse.class);

            if(brandsResponse.getStatus().getCode() == Constants.ERROR_CODE_SUCCESS) {
                return brandsResponse.getEntity();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @SuppressWarnings("unused")
    public List<City> listProvinces() {
        String listProvincesURL = URL_PREFIX + SERVICE_LIST_PROVINCES;
        ListCitiesRequest listCitiesRequest = new ListCitiesRequest();
        listCitiesRequest.setAdmin_id(adminID);
        listCitiesRequest.setToken(token);
        String bodyJson = listCitiesRequest.toJson();

        return listCitiesCommon(listProvincesURL, bodyJson);
    }

    @SuppressWarnings("unused")
    public List<City> listCities(String prefix) {
        String listCitiesURL = URL_PREFIX + SERVICE_LIST_CITIES;
        ListCitiesRequest listCitiesRequest = new ListCitiesRequest();
        listCitiesRequest.setAdmin_id(adminID);
        listCitiesRequest.setToken(token);
        listCitiesRequest.setProvince_prefix(prefix);
        String bodyJson = listCitiesRequest.toJson();

        return listCitiesCommon(listCitiesURL, bodyJson);
    }

    private List<City> listCitiesCommon(String url, String bodyJson) {
        try {
            String response = postToServer(url, bodyJson);
            CitiesResponse citiesResponse = new Gson().fromJson(response, CitiesResponse.class);

            if (citiesResponse.getStatus().getCode() == Constants.ERROR_CODE_SUCCESS) {
                return citiesResponse.getEntity();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @SuppressWarnings("unused")
    public List<StbOperator> listOperators(String cityCode) {
        String listOperatorsURL = URL_PREFIX + SERVICE_LIST_OPERATORS;
        ListOperatorsRequest listOperatorsRequest = new ListOperatorsRequest();
        listOperatorsRequest.setAdmin_id(adminID);
        listOperatorsRequest.setToken(token);
        listOperatorsRequest.setCity_code(cityCode);
        listOperatorsRequest.setFrom(0);
        listOperatorsRequest.setCount(20);
        String bodyJson = listOperatorsRequest.toJson();

        try {
            String response = postToServer(listOperatorsURL, bodyJson);
            OperatorsResponse operatorsResponse = new Gson().fromJson(response, OperatorsResponse.class);

            if (operatorsResponse.getStatus().getCode() == Constants.ERROR_CODE_SUCCESS) {
                return operatorsResponse.getEntity();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @SuppressWarnings("unused")
    public List<RemoteIndex> listRemoteIndexes(int categoryID, int brandID, String cityCode, String operatorID) {
        String listIndexesURL = URL_PREFIX + SERVICE_LIST_INDEXES;
        ListIndexesRequest listIndexesRequest = new ListIndexesRequest();
        listIndexesRequest.setAdmin_id(adminID);
        listIndexesRequest.setToken(token);
        listIndexesRequest.setCategory_id(categoryID);
        listIndexesRequest.setBrand_id(brandID);
        listIndexesRequest.setCity_code(cityCode);
        listIndexesRequest.setOperator_id(operatorID);
        listIndexesRequest.setFrom(0);
        listIndexesRequest.setCount(20);
        String bodyJson = listIndexesRequest.toJson();

        try {
            String response = postToServer(listIndexesURL, bodyJson);

            IndexesResponse indexesResponse = new Gson().fromJson(response, IndexesResponse.class);

            if (indexesResponse.getStatus().getCode() == Constants.ERROR_CODE_SUCCESS) {
                return indexesResponse.getEntity();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @SuppressWarnings("unused")
    public InputStream downloadBin(String remoteMap, int indexID) {
        String downloadURL = URL_PREFIX + SERVICE_DOWNLOAD_BIN;
        DownloadBinaryRequest downloadBinaryRequest = new DownloadBinaryRequest();
        downloadBinaryRequest.setAdmin_id(adminID);
        downloadBinaryRequest.setToken(token);
        downloadBinaryRequest.setIndex_id(indexID);

        String bodyJson = downloadBinaryRequest.toJson();

        if (null != bodyJson) {
            try {
                return postToServerForOctets(downloadURL, bodyJson);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
