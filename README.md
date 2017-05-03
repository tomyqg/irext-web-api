# irext Java web API  
Indexing to the specified remote index and download its IR binary file

#### Usage
1. Make the source code to a .jar file for your own project  

2. Java API methods  

Import classes:

    import net.irext.webapi.model.*;
    
    import net.irext.webapi.WebAPIs;

Get web API instance:

    WebAPIs webApis = WebAPIs.getInstance();
    
Sign in for access id and token:

    Admin admin = webApis.signIn(userName, password);
    
    int id = admin.getId();
    
    int token = admin.getToken();

Fetch household appliances categories:

    List<Category> categories = webApis.listCategories();
    
Fetch brands of a certain category other than STB:

    List<Brand> brands = webApis.listBrands(category.getId());

Fetch cities (in China) for STB:

    List<City> provinces = webApis.listProvinces();

    List<City> cities = webApis.listCities(provincePrefix);

Fetch STB operators of a certain city:

    List<StbOperator>; operators = webApis.listOperators(cityCode);

Fetch remote indexes of a certain brand or STB operator:

    List<RemoteIndex> remoteIndexes = webApis.listRemoteIndexes(category.getId(), brand.getId(), city.getCode(), operator.getOperator_id());

Download IR binary for certain remote index:

    InputStream is = webApis.downloadBin(remoteIndex.getRemote_map(), remoteIndex.getId());
    
