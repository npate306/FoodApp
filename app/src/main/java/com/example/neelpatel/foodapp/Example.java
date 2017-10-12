package com.example.neelpatel.foodapp;

/**
 * Created by Neel Patel on 10/12/2017.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

class AllReview {

    @SerializedName("rating")
    @Expose
    private String rating;
    @SerializedName("review_text")
    @Expose
    private String reviewText;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("rating_color")
    @Expose
    private String ratingColor;
    @SerializedName("review_time_friendly")
    @Expose
    private String reviewTimeFriendly;
    @SerializedName("rating_text")
    @Expose
    private String ratingText;
    @SerializedName("timestamp")
    @Expose
    private String timestamp;
    @SerializedName("likes")
    @Expose
    private String likes;
    @SerializedName("user")
    @Expose
    private User_ user;
    @SerializedName("comments_count")
    @Expose
    private String commentsCount;

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRatingColor() {
        return ratingColor;
    }

    public void setRatingColor(String ratingColor) {
        this.ratingColor = ratingColor;
    }

    public String getReviewTimeFriendly() {
        return reviewTimeFriendly;
    }

    public void setReviewTimeFriendly(String reviewTimeFriendly) {
        this.reviewTimeFriendly = reviewTimeFriendly;
    }

    public String getRatingText() {
        return ratingText;
    }

    public void setRatingText(String ratingText) {
        this.ratingText = ratingText;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public User_ getUser() {
        return user;
    }

    public void setUser(User_ user) {
        this.user = user;
    }

    public String getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(String commentsCount) {
        this.commentsCount = commentsCount;
    }

}


public class Example {

    @SerializedName("results_found")
    @Expose
    private String resultsFound;
    @SerializedName("results_start")
    @Expose
    private String resultsStart;
    @SerializedName("results_shown")
    @Expose
    private String resultsShown;
    @SerializedName("restaurants")
    @Expose
    private List<Restaurant> restaurants = null;

    public String getResultsFound() {
        return resultsFound;
    }

    public void setResultsFound(String resultsFound) {
        this.resultsFound = resultsFound;
    }

    public String getResultsStart() {
        return resultsStart;
    }

    public void setResultsStart(String resultsStart) {
        this.resultsStart = resultsStart;
    }

    public String getResultsShown() {
        return resultsShown;
    }

    public void setResultsShown(String resultsShown) {
        this.resultsShown = resultsShown;
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(List<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

}

class Location {

    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("locality")
    @Expose
    private String locality;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("zipcode")
    @Expose
    private String zipcode;
    @SerializedName("country_id")
    @Expose
    private String countryId;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

}


class Photo {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("thumb_url")
    @Expose
    private String thumbUrl;
    @SerializedName("user")
    @Expose
    private User user;
    @SerializedName("res_id")
    @Expose
    private String resId;
    @SerializedName("caption")
    @Expose
    private String caption;
    @SerializedName("timestamp")
    @Expose
    private String timestamp;
    @SerializedName("friendly_time")
    @Expose
    private String friendlyTime;
    @SerializedName("width")
    @Expose
    private String width;
    @SerializedName("height")
    @Expose
    private String height;
    @SerializedName("comments_count")
    @Expose
    private String commentsCount;
    @SerializedName("likes_count")
    @Expose
    private String likesCount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getResId() {
        return resId;
    }

    public void setResId(String resId) {
        this.resId = resId;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getFriendlyTime() {
        return friendlyTime;
    }

    public void setFriendlyTime(String friendlyTime) {
        this.friendlyTime = friendlyTime;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(String commentsCount) {
        this.commentsCount = commentsCount;
    }

    public String getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(String likesCount) {
        this.likesCount = likesCount;
    }

}

class Restaurant {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("average_cost_for_two")
    @Expose
    private String averageCostForTwo;
    @SerializedName("price_range")
    @Expose
    private String priceRange;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("thumb")
    @Expose
    private String thumb;
    @SerializedName("featured_image")
    @Expose
    private String featuredImage;
    @SerializedName("photos_url")
    @Expose
    private String photosUrl;
    @SerializedName("menu_url")
    @Expose
    private String menuUrl;
    @SerializedName("events_url")
    @Expose
    private String eventsUrl;
    @SerializedName("user_rating")
    @Expose
    private UserRating userRating;
    @SerializedName("has_online_delivery")
    @Expose
    private String hasOnlineDelivery;
    @SerializedName("is_delivering_now")
    @Expose
    private String isDeliveringNow;
    @SerializedName("has_table_booking")
    @Expose
    private String hasTableBooking;
    @SerializedName("deeplink")
    @Expose
    private String deeplink;
    @SerializedName("cuisines")
    @Expose
    private String cuisines;
    @SerializedName("all_reviews_count")
    @Expose
    private String allReviewsCount;
    @SerializedName("photo_count")
    @Expose
    private String photoCount;
    @SerializedName("phone_numbers")
    @Expose
    private String phoneNumbers;
    @SerializedName("photos")
    @Expose
    private List<Photo> photos = null;
    @SerializedName("all_reviews")
    @Expose
    private List<AllReview> allReviews = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getAverageCostForTwo() {
        return averageCostForTwo;
    }

    public void setAverageCostForTwo(String averageCostForTwo) {
        this.averageCostForTwo = averageCostForTwo;
    }

    public String getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(String priceRange) {
        this.priceRange = priceRange;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getFeaturedImage() {
        return featuredImage;
    }

    public void setFeaturedImage(String featuredImage) {
        this.featuredImage = featuredImage;
    }

    public String getPhotosUrl() {
        return photosUrl;
    }

    public void setPhotosUrl(String photosUrl) {
        this.photosUrl = photosUrl;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public String getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public UserRating getUserRating() {
        return userRating;
    }

    public void setUserRating(UserRating userRating) {
        this.userRating = userRating;
    }

    public String getHasOnlineDelivery() {
        return hasOnlineDelivery;
    }

    public void setHasOnlineDelivery(String hasOnlineDelivery) {
        this.hasOnlineDelivery = hasOnlineDelivery;
    }

    public String getIsDeliveringNow() {
        return isDeliveringNow;
    }

    public void setIsDeliveringNow(String isDeliveringNow) {
        this.isDeliveringNow = isDeliveringNow;
    }

    public String getHasTableBooking() {
        return hasTableBooking;
    }

    public void setHasTableBooking(String hasTableBooking) {
        this.hasTableBooking = hasTableBooking;
    }

    public String getDeeplink() {
        return deeplink;
    }

    public void setDeeplink(String deeplink) {
        this.deeplink = deeplink;
    }

    public String getCuisines() {
        return cuisines;
    }

    public void setCuisines(String cuisines) {
        this.cuisines = cuisines;
    }

    public String getAllReviewsCount() {
        return allReviewsCount;
    }

    public void setAllReviewsCount(String allReviewsCount) {
        this.allReviewsCount = allReviewsCount;
    }

    public String getPhotoCount() {
        return photoCount;
    }

    public void setPhotoCount(String photoCount) {
        this.photoCount = photoCount;
    }

    public String getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public List<AllReview> getAllReviews() {
        return allReviews;
    }

    public void setAllReviews(List<AllReview> allReviews) {
        this.allReviews = allReviews;
    }

}

class User {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("zomato_handle")
    @Expose
    private String zomatoHandle;
    @SerializedName("foodie_level")
    @Expose
    private String foodieLevel;
    @SerializedName("foodie_level_num")
    @Expose
    private String foodieLevelNum;
    @SerializedName("foodie_color")
    @Expose
    private String foodieColor;
    @SerializedName("profile_url")
    @Expose
    private String profileUrl;
    @SerializedName("profile_deeplink")
    @Expose
    private String profileDeeplink;
    @SerializedName("profile_image")
    @Expose
    private String profileImage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZomatoHandle() {
        return zomatoHandle;
    }

    public void setZomatoHandle(String zomatoHandle) {
        this.zomatoHandle = zomatoHandle;
    }

    public String getFoodieLevel() {
        return foodieLevel;
    }

    public void setFoodieLevel(String foodieLevel) {
        this.foodieLevel = foodieLevel;
    }

    public String getFoodieLevelNum() {
        return foodieLevelNum;
    }

    public void setFoodieLevelNum(String foodieLevelNum) {
        this.foodieLevelNum = foodieLevelNum;
    }

    public String getFoodieColor() {
        return foodieColor;
    }

    public void setFoodieColor(String foodieColor) {
        this.foodieColor = foodieColor;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public String getProfileDeeplink() {
        return profileDeeplink;
    }

    public void setProfileDeeplink(String profileDeeplink) {
        this.profileDeeplink = profileDeeplink;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

}

class UserRating {

    @SerializedName("aggregate_rating")
    @Expose
    private String aggregateRating;
    @SerializedName("rating_text")
    @Expose
    private String ratingText;
    @SerializedName("rating_color")
    @Expose
    private String ratingColor;
    @SerializedName("votes")
    @Expose
    private String votes;

    public String getAggregateRating() {
        return aggregateRating;
    }

    public void setAggregateRating(String aggregateRating) {
        this.aggregateRating = aggregateRating;
    }

    public String getRatingText() {
        return ratingText;
    }

    public void setRatingText(String ratingText) {
        this.ratingText = ratingText;
    }

    public String getRatingColor() {
        return ratingColor;
    }

    public void setRatingColor(String ratingColor) {
        this.ratingColor = ratingColor;
    }

    public String getVotes() {
        return votes;
    }

    public void setVotes(String votes) {
        this.votes = votes;
    }

}

class User_ {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("zomato_handle")
    @Expose
    private String zomatoHandle;
    @SerializedName("foodie_level")
    @Expose
    private String foodieLevel;
    @SerializedName("foodie_level_num")
    @Expose
    private String foodieLevelNum;
    @SerializedName("foodie_color")
    @Expose
    private String foodieColor;
    @SerializedName("profile_url")
    @Expose
    private String profileUrl;
    @SerializedName("profile_deeplink")
    @Expose
    private String profileDeeplink;
    @SerializedName("profile_image")
    @Expose
    private String profileImage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZomatoHandle() {
        return zomatoHandle;
    }

    public void setZomatoHandle(String zomatoHandle) {
        this.zomatoHandle = zomatoHandle;
    }

    public String getFoodieLevel() {
        return foodieLevel;
    }

    public void setFoodieLevel(String foodieLevel) {
        this.foodieLevel = foodieLevel;
    }

    public String getFoodieLevelNum() {
        return foodieLevelNum;
    }

    public void setFoodieLevelNum(String foodieLevelNum) {
        this.foodieLevelNum = foodieLevelNum;
    }

    public String getFoodieColor() {
        return foodieColor;
    }

    public void setFoodieColor(String foodieColor) {
        this.foodieColor = foodieColor;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public String getProfileDeeplink() {
        return profileDeeplink;
    }

    public void setProfileDeeplink(String profileDeeplink) {
        this.profileDeeplink = profileDeeplink;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

}
