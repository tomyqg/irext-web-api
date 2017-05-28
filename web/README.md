## Usage

### 1. Register your APP
Register your APP on irext SDK console [irext SDK console](http://irext.net), (You need to register an irext account first

While your APP is registered, you can see the APP key and APP secret in your APP list

### 2. Import the SDK
You can either import this project or download the web-api .jar file from [Java SDK](http://irext-lib-releaese.oss-cn-hangzhou.aliyuncs.com/decode/0.1.2/web-api-java-0.1.2.jar) and import to your project

### 3. Use the SDK

Import classes:
```java
import net.irext.webapi.model.*;    
import net.irext.webapi.WebAPIs;
```
Get web API instance:
```java
WebAPIs webApis = WebAPIs.getInstance();
```
Sign in for access id and token:
```java
// App key and secret are fetched in step 1.
UserApp userApp = webApis.signIn(appKey, appSecret);
int id = userApp.getId();
int token = userApp.getToken();
```
Fetch household appliances categories:
```java
List<Category> categories = webApis.listCategories();
```
Fetch brands of a certain category other than STB:
```java
List<Brand> brands = webApis.listBrands(category.getId());
```
Fetch cities (in China) for STB:
```java
List<City> provinces = webApis.listProvinces();
List<City> cities = webApis.listCities(provincePrefix);
```
Fetch STB operators of a certain city:
```java
List<StbOperator>; operators = webApis.listOperators(cityCode);
```
Fetch remote indexes of a certain brand or STB operator:
```java
List<RemoteIndex> remoteIndexes = webApis.listRemoteIndexes(category.getId(), brand.getId(), city.getCode(), operator.getOperator_id());
```
Download IR binary for certain remote index:
```java
InputStream is = webApis.downloadBin(remoteIndex.getRemote_map(), remoteIndex.getId());
```
