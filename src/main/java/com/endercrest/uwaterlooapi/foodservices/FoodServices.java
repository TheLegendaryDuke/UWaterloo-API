package com.endercrest.uwaterlooapi.foodservices;

import com.endercrest.uwaterlooapi.api.ApiRequest;
import com.endercrest.uwaterlooapi.foodservices.models.*;
import com.google.gson.reflect.TypeToken;

import java.util.List;

/**
 * Created by Thomas Cordua-von Specht on 11/25/2016.
 */
public class FoodServices {

    private final String api;

    private static final String MENU_ENDPOINT = "foodservices/menu";
    private static final String NOTES_ENDPOINT = "foodservices/notes";
    private static final String DIETS_ENDPOINT = "foodservices/diets";
    private static final String OUTLETS_ENDPOINT = "foodservices/outlets";
    private static final String LOCATIONS_ENDPOINT = "foodservices/locations";
    private static final String WATCARD_ENDPOINT = "foodservices/watcard";
    private static final String ANNOUNCEMENT_ENDPOINT = "foodservices/announcements";
    private static final String PRODUCT_ENDPOINT = "foodservices/products/%s";
    private static final String MENU_DATE_ENDPOINT = "foodservices/%s/%s/menu";
    private static final String NOTES_DATE_ENDPOINT = "foodservices/%s/%s/notes";
    private static final String ANNOUNCEMENT_DATE_ENDPOINT = "foodservices/%s/%s/announcements";

    public FoodServices(String api){
        this.api = api;
    }

    /**
     * Retrieve all menu items from all outlets for the current week.
     * @return {@link FoodServiceMenu}
     */
    public ApiRequest<FoodServiceMenu> getAllMenus(){
        return ApiRequest.createApiRequest(MENU_ENDPOINT, api,
                new TypeToken<ApiRequest<FoodServiceMenu>>(){}.getType());
    }

    /**
     * Retrieve all notes for the current week.
     * @return {@link FoodServiceNote}
     */
    public ApiRequest<List<FoodServiceNote>> getAllNotes(){
        return ApiRequest.createApiRequest(NOTES_ENDPOINT, api,
                new TypeToken<ApiRequest<List<FoodServiceNote>>>(){}.getType());
    }

    /**
     * Get all the available diets.
     * @return {@link FoodServiceDiet}
     */
    public ApiRequest<List<FoodServiceDiet>> getAllDiets(){
        return ApiRequest.createApiRequest(DIETS_ENDPOINT, api,
                new TypeToken<ApiRequest<List<FoodServiceDiet>>>(){}.getType());
    }

    /**
     * Retrieve all outlets.
     * @return {@link FoodServiceOutlet}
     */
    public ApiRequest<List<FoodServiceOutlet>> getAllOutlets(){
        return ApiRequest.createApiRequest(OUTLETS_ENDPOINT, api,
                new TypeToken<ApiRequest<List<FoodServiceOutlet>>>(){}.getType());
    }

    /**
     * Retrieve all food services locations from "/foodservices/locations"
     * @return {@link FoodServiceLocation}
     */
    public ApiRequest<List<FoodServiceLocation>> getAllLocations(){
        return ApiRequest.createApiRequest(LOCATIONS_ENDPOINT, api,
                new TypeToken<ApiRequest<List<FoodServiceLocation>>>(){}.getType());
    }

    /**
     * Retrieve all watcard vendors for food services, from
     * "/foodservices/watcard"
     * @return {@link FoodServiceWatcardVendor}
     */
    public ApiRequest<List<FoodServiceWatcardVendor>> getAllWatcardVendor(){
        return ApiRequest.createApiRequest(WATCARD_ENDPOINT, api,
                new TypeToken<ApiRequest<List<FoodServiceWatcardVendor>>>(){}.getType());
    }

    /**
     * Retrieve all announcements for food services for the current week
     * from "foodservices/announcements"
     * @return {@link FoodServiceAnnouncement}
     */
    public ApiRequest<List<FoodServiceAnnouncement>> getAllAnnouncements(){
        return ApiRequest.createApiRequest(ANNOUNCEMENT_ENDPOINT, api,
                new TypeToken<ApiRequest<List<FoodServiceAnnouncement>>>(){}.getType());
    }

    /**
     * Get all details for a specific product from food services.
     * @param productId The id of the product.
     * @return {@link FoodServiceProduct}
     */
    public ApiRequest<FoodServiceProduct> getProductDetails(String productId){
        return ApiRequest.createApiRequest(String.format(PRODUCT_ENDPOINT, productId), api,
                new TypeToken<ApiRequest<FoodServiceProduct>>(){}.getType());
    }

    /**
     * Get a weeks specific menu for any given year and month.
     * @param year Must be a number. IE. "2016"
     * @param week Must be a number. IE. "22"
     * @return {@link FoodServiceMenu}
     */
    public ApiRequest<FoodServiceMenu> getAllMenus(String year, String week){
        return ApiRequest.createApiRequest(String.format(MENU_DATE_ENDPOINT, year, week), api,
                new TypeToken<ApiRequest<FoodServiceMenu>>(){}.getType());
    }

    /**
     * Get a weeks specific notes for any given year and month.
     * @param year Must be a number. IE. "2016"
     * @param week Must be a number. IE. "22"
     * @return {@link FoodServiceNote}
     */
    public ApiRequest<List<FoodServiceNote>> getAllNotes(String year, String week){
        return ApiRequest.createApiRequest(String.format(NOTES_DATE_ENDPOINT, year, week), api,
                new TypeToken<ApiRequest<List<FoodServiceNote>>>(){}.getType());
    }

    /**
     * Get a weeks specific announcement for any given year and month.
     * @param year Must be a number. IE. "2016"
     * @param week Must be a number. IE. "22"
     * @return {@link FoodServiceNote}
     */
    public ApiRequest<List<FoodServiceAnnouncement>> getAllAnnouncements(String year, String week){
        return ApiRequest.createApiRequest(String.format(ANNOUNCEMENT_DATE_ENDPOINT, year, week), api,
                new TypeToken<ApiRequest<List<FoodServiceAnnouncement>>>(){}.getType());
    }
}