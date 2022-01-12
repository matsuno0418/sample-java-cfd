/*
 * Continous Food Delievery
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.circleci.continuousfooddelivery;

import com.google.gson.reflect.TypeToken;


import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MenuApi {
    private ApiClient localVarApiClient;

    public MenuApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MenuApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for addMenuItem
     * @param menuItem Item to add to the store (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Null response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addMenuItemCall(MenuItem menuItem, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = menuItem;

        // create path and map variables
        String localVarPath = "/menu";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call addMenuItemValidateBeforeCall(MenuItem menuItem, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'menuItem' is set
        if (menuItem == null) {
            throw new ApiException("Missing the required parameter 'menuItem' when calling addMenuItem(Async)");
        }
        

        okhttp3.Call localVarCall = addMenuItemCall(menuItem, _callback);
        return localVarCall;

    }

    /**
     * Create a menu item
     * Creates a new item in the menu. Duplicates are allowed
     * @param menuItem Item to add to the store (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Null response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public void addMenuItem(MenuItem menuItem) throws ApiException {
        addMenuItemWithHttpInfo(menuItem);
    }

    /**
     * Create a menu item
     * Creates a new item in the menu. Duplicates are allowed
     * @param menuItem Item to add to the store (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Null response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> addMenuItemWithHttpInfo(MenuItem menuItem) throws ApiException {
        okhttp3.Call localVarCall = addMenuItemValidateBeforeCall(menuItem, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Create a menu item (asynchronously)
     * Creates a new item in the menu. Duplicates are allowed
     * @param menuItem Item to add to the store (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Null response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addMenuItemAsync(MenuItem menuItem, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = addMenuItemValidateBeforeCall(menuItem, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for listMenu
     * @param limit How many items to return at one time (max 100) (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A paged array of menu items </td><td>  * x-next - A link to the next page of responses <br>  </td></tr>
        <tr><td> 0 </td><td> unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listMenuCall(Integer limit, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/menu";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listMenuValidateBeforeCall(Integer limit, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listMenuCall(limit, _callback);
        return localVarCall;

    }

    /**
     * List all menu items
     * 
     * @param limit How many items to return at one time (max 100) (optional)
     * @return List&lt;MenuItem&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A paged array of menu items </td><td>  * x-next - A link to the next page of responses <br>  </td></tr>
        <tr><td> 0 </td><td> unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public List<MenuItem> listMenu(Integer limit) throws ApiException {
        ApiResponse<List<MenuItem>> localVarResp = listMenuWithHttpInfo(limit);
        return localVarResp.getData();
    }

    /**
     * List all menu items
     * 
     * @param limit How many items to return at one time (max 100) (optional)
     * @return ApiResponse&lt;List&lt;MenuItem&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A paged array of menu items </td><td>  * x-next - A link to the next page of responses <br>  </td></tr>
        <tr><td> 0 </td><td> unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<MenuItem>> listMenuWithHttpInfo(Integer limit) throws ApiException {
        okhttp3.Call localVarCall = listMenuValidateBeforeCall(limit, null);
        Type localVarReturnType = new TypeToken<List<MenuItem>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List all menu items (asynchronously)
     * 
     * @param limit How many items to return at one time (max 100) (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A paged array of menu items </td><td>  * x-next - A link to the next page of responses <br>  </td></tr>
        <tr><td> 0 </td><td> unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listMenuAsync(Integer limit, final ApiCallback<List<MenuItem>> _callback) throws ApiException {

        okhttp3.Call localVarCall = listMenuValidateBeforeCall(limit, _callback);
        Type localVarReturnType = new TypeToken<List<MenuItem>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for showMenuItemById
     * @param itemId The id of the menu item to retrieve (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Expected response to a valid request </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call showMenuItemByIdCall(String itemId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/menu/{itemId}"
            .replaceAll("\\{" + "itemId" + "\\}", localVarApiClient.escapeString(itemId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call showMenuItemByIdValidateBeforeCall(String itemId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new ApiException("Missing the required parameter 'itemId' when calling showMenuItemById(Async)");
        }
        

        okhttp3.Call localVarCall = showMenuItemByIdCall(itemId, _callback);
        return localVarCall;

    }

    /**
     * Info for a specific menu item
     * 
     * @param itemId The id of the menu item to retrieve (required)
     * @return MenuItem
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Expected response to a valid request </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public MenuItem showMenuItemById(String itemId) throws ApiException {
        ApiResponse<MenuItem> localVarResp = showMenuItemByIdWithHttpInfo(itemId);
        return localVarResp.getData();
    }

    /**
     * Info for a specific menu item
     * 
     * @param itemId The id of the menu item to retrieve (required)
     * @return ApiResponse&lt;MenuItem&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Expected response to a valid request </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MenuItem> showMenuItemByIdWithHttpInfo(String itemId) throws ApiException {
        okhttp3.Call localVarCall = showMenuItemByIdValidateBeforeCall(itemId, null);
        Type localVarReturnType = new TypeToken<MenuItem>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Info for a specific menu item (asynchronously)
     * 
     * @param itemId The id of the menu item to retrieve (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Expected response to a valid request </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call showMenuItemByIdAsync(String itemId, final ApiCallback<MenuItem> _callback) throws ApiException {

        okhttp3.Call localVarCall = showMenuItemByIdValidateBeforeCall(itemId, _callback);
        Type localVarReturnType = new TypeToken<MenuItem>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}