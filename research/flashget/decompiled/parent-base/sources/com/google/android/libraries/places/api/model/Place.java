package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.annotation.g0;
import androidx.annotation.l;
import androidx.annotation.q0;
import androidx.annotation.x;
import b9.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.libraries.places.internal.zzha;
import com.google.android.libraries.places.internal.zzhf;
import com.google.android.libraries.places.internal.zzhs;
import com.google.android.libraries.places.internal.zzie;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
@c
/* loaded from: classes5.dex */
public abstract class Place implements Parcelable {
    public static final int PRICE_LEVEL_MAX_VALUE = 4;
    public static final int PRICE_LEVEL_MIN_VALUE = 0;
    public static final double RATING_MAX_VALUE = 5.0d;
    public static final double RATING_MIN_VALUE = 1.0d;

    /* compiled from: com.google.android.libraries.places:places@@2.6.0 */
    @c.a
    public static abstract class Builder {
        @RecentlyNonNull
        public Place build() {
            Place zza = zza();
            List<String> attributions = zza.getAttributions();
            if (attributions != null) {
                Iterator<String> it = attributions.iterator();
                while (it.hasNext()) {
                    zzha.zzi(!TextUtils.isEmpty(it.next()), ProtectedSandApp.s("\ue540"));
                }
            }
            Integer priceLevel = zza.getPriceLevel();
            if (priceLevel != null) {
                zzha.zzk(zzie.zzc(0, 4).zze(priceLevel), ProtectedSandApp.s("\ue541"), 0, 4, priceLevel);
            }
            Double rating = zza.getRating();
            if (rating != null) {
                Double valueOf = Double.valueOf(1.0d);
                Double valueOf2 = Double.valueOf(5.0d);
                zzha.zzk(zzie.zzc(valueOf, valueOf2).zze(rating), ProtectedSandApp.s("\ue542"), valueOf, valueOf2, rating);
            }
            Integer userRatingsTotal = zza.getUserRatingsTotal();
            if (userRatingsTotal != null && !zzie.zzb(0).zze(userRatingsTotal)) {
                throw new IllegalStateException(zzhf.zza(ProtectedSandApp.s("\ue543"), userRatingsTotal));
            }
            if (attributions != null) {
                setAttributions(zzhs.zzk(attributions));
            }
            List<PhotoMetadata> photoMetadatas = zza.getPhotoMetadatas();
            if (photoMetadatas != null) {
                setPhotoMetadatas(zzhs.zzk(photoMetadatas));
            }
            List<Type> types = zza.getTypes();
            if (types != null) {
                setTypes(zzhs.zzk(types));
            }
            return zza();
        }

        @RecentlyNullable
        public abstract String getAddress();

        @RecentlyNullable
        public abstract AddressComponents getAddressComponents();

        @RecentlyNullable
        public abstract List<String> getAttributions();

        @RecentlyNullable
        public abstract BusinessStatus getBusinessStatus();

        @RecentlyNullable
        @l
        public abstract Integer getIconBackgroundColor();

        @RecentlyNullable
        public abstract String getIconUrl();

        @RecentlyNullable
        public abstract String getId();

        @RecentlyNullable
        public abstract LatLng getLatLng();

        @RecentlyNullable
        public abstract String getName();

        @RecentlyNullable
        public abstract OpeningHours getOpeningHours();

        @RecentlyNullable
        public abstract String getPhoneNumber();

        @RecentlyNullable
        public abstract List<PhotoMetadata> getPhotoMetadatas();

        @RecentlyNullable
        public abstract PlusCode getPlusCode();

        @RecentlyNullable
        @g0(from = 0, to = 4)
        public abstract Integer getPriceLevel();

        @RecentlyNullable
        @x(from = 1.0d, to = Place.RATING_MAX_VALUE)
        public abstract Double getRating();

        @RecentlyNullable
        public abstract List<Type> getTypes();

        @RecentlyNullable
        @g0(from = 0)
        public abstract Integer getUserRatingsTotal();

        @RecentlyNullable
        public abstract Integer getUtcOffsetMinutes();

        @RecentlyNullable
        public abstract LatLngBounds getViewport();

        @RecentlyNullable
        public abstract Uri getWebsiteUri();

        @RecentlyNonNull
        public abstract Builder setAddress(@q0 String str);

        @RecentlyNonNull
        public abstract Builder setAddressComponents(@q0 AddressComponents addressComponents);

        @RecentlyNonNull
        public abstract Builder setAttributions(@q0 List<String> list);

        @RecentlyNonNull
        public abstract Builder setBusinessStatus(@q0 BusinessStatus businessStatus);

        @RecentlyNonNull
        public abstract Builder setIconBackgroundColor(@q0 Integer num);

        @RecentlyNonNull
        public abstract Builder setIconUrl(@q0 String str);

        @RecentlyNonNull
        public abstract Builder setId(@q0 String str);

        @RecentlyNonNull
        public abstract Builder setLatLng(@q0 LatLng latLng);

        @RecentlyNonNull
        public abstract Builder setName(@q0 String str);

        @RecentlyNonNull
        public abstract Builder setOpeningHours(@q0 OpeningHours openingHours);

        @RecentlyNonNull
        public abstract Builder setPhoneNumber(@q0 String str);

        @RecentlyNonNull
        public abstract Builder setPhotoMetadatas(@q0 List<PhotoMetadata> list);

        @RecentlyNonNull
        public abstract Builder setPlusCode(@q0 PlusCode plusCode);

        @RecentlyNonNull
        public abstract Builder setPriceLevel(@q0 @g0(from = 0, to = 4) Integer num);

        @RecentlyNonNull
        public abstract Builder setRating(@q0 @x(from = 1.0d, to = 5.0d) Double d5);

        @RecentlyNonNull
        public abstract Builder setTypes(@q0 List<Type> list);

        @RecentlyNonNull
        public abstract Builder setUserRatingsTotal(@q0 @g0(from = 0) Integer num);

        @RecentlyNonNull
        public abstract Builder setUtcOffsetMinutes(@q0 Integer num);

        @RecentlyNonNull
        public abstract Builder setViewport(@q0 LatLngBounds latLngBounds);

        @RecentlyNonNull
        public abstract Builder setWebsiteUri(@q0 Uri uri);

        abstract Place zza();
    }

    /* compiled from: com.google.android.libraries.places:places@@2.6.0 */
    public enum BusinessStatus implements Parcelable {
        OPERATIONAL,
        CLOSED_TEMPORARILY,
        CLOSED_PERMANENTLY;


        @RecentlyNonNull
        public static final Parcelable.Creator<BusinessStatus> CREATOR = new zzbf();

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i4) {
            parcel.writeString(name());
        }
    }

    /* compiled from: com.google.android.libraries.places:places@@2.6.0 */
    public enum Field implements Parcelable {
        ADDRESS,
        ADDRESS_COMPONENTS,
        BUSINESS_STATUS,
        ID,
        LAT_LNG,
        NAME,
        OPENING_HOURS,
        PHONE_NUMBER,
        PHOTO_METADATAS,
        PLUS_CODE,
        PRICE_LEVEL,
        RATING,
        TYPES,
        USER_RATINGS_TOTAL,
        UTC_OFFSET,
        VIEWPORT,
        WEBSITE_URI,
        ICON_BACKGROUND_COLOR,
        ICON_URL;


        @RecentlyNonNull
        public static final Parcelable.Creator<Field> CREATOR = new zzbg();

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i4) {
            parcel.writeString(name());
        }
    }

    /* compiled from: com.google.android.libraries.places:places@@2.6.0 */
    public enum Type implements Parcelable {
        OTHER,
        ACCOUNTING,
        ADMINISTRATIVE_AREA_LEVEL_1,
        ADMINISTRATIVE_AREA_LEVEL_2,
        ADMINISTRATIVE_AREA_LEVEL_3,
        ADMINISTRATIVE_AREA_LEVEL_4,
        ADMINISTRATIVE_AREA_LEVEL_5,
        AIRPORT,
        AMUSEMENT_PARK,
        AQUARIUM,
        ARCHIPELAGO,
        ART_GALLERY,
        ATM,
        BAKERY,
        BANK,
        BAR,
        BEAUTY_SALON,
        BICYCLE_STORE,
        BOOK_STORE,
        BOWLING_ALLEY,
        BUS_STATION,
        CAFE,
        CAMPGROUND,
        CAR_DEALER,
        CAR_RENTAL,
        CAR_REPAIR,
        CAR_WASH,
        CASINO,
        CEMETERY,
        CHURCH,
        CITY_HALL,
        CLOTHING_STORE,
        COLLOQUIAL_AREA,
        CONTINENT,
        CONVENIENCE_STORE,
        COUNTRY,
        COURTHOUSE,
        DENTIST,
        DEPARTMENT_STORE,
        DOCTOR,
        DRUGSTORE,
        ELECTRICIAN,
        ELECTRONICS_STORE,
        EMBASSY,
        ESTABLISHMENT,
        FINANCE,
        FIRE_STATION,
        FLOOR,
        FLORIST,
        FOOD,
        FUNERAL_HOME,
        FURNITURE_STORE,
        GAS_STATION,
        GENERAL_CONTRACTOR,
        GEOCODE,
        GROCERY_OR_SUPERMARKET,
        GYM,
        HAIR_CARE,
        HARDWARE_STORE,
        HEALTH,
        HINDU_TEMPLE,
        HOME_GOODS_STORE,
        HOSPITAL,
        INSURANCE_AGENCY,
        INTERSECTION,
        JEWELRY_STORE,
        LAUNDRY,
        LAWYER,
        LIBRARY,
        LIGHT_RAIL_STATION,
        LIQUOR_STORE,
        LOCAL_GOVERNMENT_OFFICE,
        LOCALITY,
        LOCKSMITH,
        LODGING,
        MEAL_DELIVERY,
        MEAL_TAKEAWAY,
        MOSQUE,
        MOVIE_RENTAL,
        MOVIE_THEATER,
        MOVING_COMPANY,
        MUSEUM,
        NATURAL_FEATURE,
        NEIGHBORHOOD,
        NIGHT_CLUB,
        PAINTER,
        PARK,
        PARKING,
        PET_STORE,
        PHARMACY,
        PHYSIOTHERAPIST,
        PLACE_OF_WORSHIP,
        PLUMBER,
        PLUS_CODE,
        POINT_OF_INTEREST,
        POLICE,
        POLITICAL,
        POST_BOX,
        POST_OFFICE,
        POSTAL_CODE_PREFIX,
        POSTAL_CODE_SUFFIX,
        POSTAL_CODE,
        POSTAL_TOWN,
        PREMISE,
        PRIMARY_SCHOOL,
        REAL_ESTATE_AGENCY,
        RESTAURANT,
        ROOFING_CONTRACTOR,
        ROOM,
        ROUTE,
        RV_PARK,
        SCHOOL,
        SECONDARY_SCHOOL,
        SHOE_STORE,
        SHOPPING_MALL,
        SPA,
        STADIUM,
        STORAGE,
        STORE,
        STREET_ADDRESS,
        STREET_NUMBER,
        SUBLOCALITY_LEVEL_1,
        SUBLOCALITY_LEVEL_2,
        SUBLOCALITY_LEVEL_3,
        SUBLOCALITY_LEVEL_4,
        SUBLOCALITY_LEVEL_5,
        SUBLOCALITY,
        SUBPREMISE,
        SUBWAY_STATION,
        SUPERMARKET,
        SYNAGOGUE,
        TAXI_STAND,
        TOURIST_ATTRACTION,
        TOWN_SQUARE,
        TRAIN_STATION,
        TRANSIT_STATION,
        TRAVEL_AGENCY,
        UNIVERSITY,
        VETERINARY_CARE,
        ZOO;


        @RecentlyNonNull
        public static final Parcelable.Creator<Type> CREATOR = new zzbh();

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i4) {
            parcel.writeString(name());
        }
    }

    @RecentlyNonNull
    public static Builder builder() {
        return new zzq();
    }

    @RecentlyNullable
    public abstract String getAddress();

    @RecentlyNullable
    public abstract AddressComponents getAddressComponents();

    @RecentlyNullable
    public abstract List<String> getAttributions();

    @RecentlyNullable
    public abstract BusinessStatus getBusinessStatus();

    @RecentlyNullable
    @l
    public abstract Integer getIconBackgroundColor();

    @RecentlyNullable
    public abstract String getIconUrl();

    @RecentlyNullable
    public abstract String getId();

    @RecentlyNullable
    public abstract LatLng getLatLng();

    @RecentlyNullable
    public abstract String getName();

    @RecentlyNullable
    public abstract OpeningHours getOpeningHours();

    @RecentlyNullable
    public abstract String getPhoneNumber();

    @RecentlyNullable
    public abstract List<PhotoMetadata> getPhotoMetadatas();

    @RecentlyNullable
    public abstract PlusCode getPlusCode();

    @RecentlyNullable
    @g0(from = 0, to = 4)
    public abstract Integer getPriceLevel();

    @RecentlyNullable
    @x(from = 1.0d, to = RATING_MAX_VALUE)
    public abstract Double getRating();

    @RecentlyNullable
    public abstract List<Type> getTypes();

    @RecentlyNullable
    @g0(from = 0)
    public abstract Integer getUserRatingsTotal();

    @RecentlyNullable
    public abstract Integer getUtcOffsetMinutes();

    @RecentlyNullable
    public abstract LatLngBounds getViewport();

    @RecentlyNullable
    public abstract Uri getWebsiteUri();

    @RecentlyNullable
    public Boolean isOpen() {
        return isOpen(System.currentTimeMillis());
    }

    @RecentlyNullable
    public Boolean isOpen(long j4) {
        return zzbe.zza(this, j4);
    }
}
