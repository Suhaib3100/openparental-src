package com.google.android.libraries.places.internal;

import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.DayOfWeek;
import com.google.android.libraries.places.api.model.LocalTime;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.TimeOfWeek;
import com.google.android.libraries.places.internal.zzdv;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzds {
    private static final zzhv zza;
    private static final zzhv zzb;

    static {
        zzhu zzhuVar = new zzhu();
        zzhuVar.zza(ProtectedSandApp.s("\ue87d"), Place.BusinessStatus.OPERATIONAL);
        zzhuVar.zza(ProtectedSandApp.s("\ue87e"), Place.BusinessStatus.CLOSED_TEMPORARILY);
        zzhuVar.zza(ProtectedSandApp.s("\ue87f"), Place.BusinessStatus.CLOSED_PERMANENTLY);
        zza = zzhuVar.zzb();
        zzhu zzhuVar2 = new zzhu();
        zzhuVar2.zza(ProtectedSandApp.s("\ue880"), Place.Type.ACCOUNTING);
        zzhuVar2.zza(ProtectedSandApp.s("\ue881"), Place.Type.ADMINISTRATIVE_AREA_LEVEL_1);
        zzhuVar2.zza(ProtectedSandApp.s("\ue882"), Place.Type.ADMINISTRATIVE_AREA_LEVEL_2);
        zzhuVar2.zza(ProtectedSandApp.s("\ue883"), Place.Type.ADMINISTRATIVE_AREA_LEVEL_3);
        zzhuVar2.zza(ProtectedSandApp.s("\ue884"), Place.Type.ADMINISTRATIVE_AREA_LEVEL_4);
        zzhuVar2.zza(ProtectedSandApp.s("\ue885"), Place.Type.ADMINISTRATIVE_AREA_LEVEL_5);
        zzhuVar2.zza(ProtectedSandApp.s("\ue886"), Place.Type.AIRPORT);
        zzhuVar2.zza(ProtectedSandApp.s("\ue887"), Place.Type.AMUSEMENT_PARK);
        zzhuVar2.zza(ProtectedSandApp.s("\ue888"), Place.Type.AQUARIUM);
        zzhuVar2.zza(ProtectedSandApp.s("\ue889"), Place.Type.ARCHIPELAGO);
        zzhuVar2.zza(ProtectedSandApp.s("\ue88a"), Place.Type.ART_GALLERY);
        zzhuVar2.zza(ProtectedSandApp.s("\ue88b"), Place.Type.ATM);
        zzhuVar2.zza(ProtectedSandApp.s("\ue88c"), Place.Type.BAKERY);
        zzhuVar2.zza(ProtectedSandApp.s("\ue88d"), Place.Type.BANK);
        zzhuVar2.zza(ProtectedSandApp.s("\ue88e"), Place.Type.BAR);
        zzhuVar2.zza(ProtectedSandApp.s("\ue88f"), Place.Type.BEAUTY_SALON);
        zzhuVar2.zza(ProtectedSandApp.s("\ue890"), Place.Type.BICYCLE_STORE);
        zzhuVar2.zza(ProtectedSandApp.s("\ue891"), Place.Type.BOOK_STORE);
        zzhuVar2.zza(ProtectedSandApp.s("\ue892"), Place.Type.BOWLING_ALLEY);
        zzhuVar2.zza(ProtectedSandApp.s("\ue893"), Place.Type.BUS_STATION);
        zzhuVar2.zza(ProtectedSandApp.s("\ue894"), Place.Type.CAFE);
        zzhuVar2.zza(ProtectedSandApp.s("\ue895"), Place.Type.CAMPGROUND);
        zzhuVar2.zza(ProtectedSandApp.s("\ue896"), Place.Type.CAR_DEALER);
        zzhuVar2.zza(ProtectedSandApp.s("\ue897"), Place.Type.CAR_RENTAL);
        zzhuVar2.zza(ProtectedSandApp.s("\ue898"), Place.Type.CAR_REPAIR);
        zzhuVar2.zza(ProtectedSandApp.s("\ue899"), Place.Type.CAR_WASH);
        zzhuVar2.zza(ProtectedSandApp.s("\ue89a"), Place.Type.CASINO);
        zzhuVar2.zza(ProtectedSandApp.s("\ue89b"), Place.Type.CEMETERY);
        zzhuVar2.zza(ProtectedSandApp.s("\ue89c"), Place.Type.CHURCH);
        zzhuVar2.zza(ProtectedSandApp.s("\ue89d"), Place.Type.CITY_HALL);
        zzhuVar2.zza(ProtectedSandApp.s("\ue89e"), Place.Type.CLOTHING_STORE);
        zzhuVar2.zza(ProtectedSandApp.s("\ue89f"), Place.Type.COLLOQUIAL_AREA);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8a0"), Place.Type.CONTINENT);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8a1"), Place.Type.CONVENIENCE_STORE);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8a2"), Place.Type.COUNTRY);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8a3"), Place.Type.COURTHOUSE);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8a4"), Place.Type.DENTIST);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8a5"), Place.Type.DEPARTMENT_STORE);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8a6"), Place.Type.DOCTOR);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8a7"), Place.Type.DRUGSTORE);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8a8"), Place.Type.ELECTRICIAN);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8a9"), Place.Type.ELECTRONICS_STORE);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8aa"), Place.Type.EMBASSY);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8ab"), Place.Type.ESTABLISHMENT);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8ac"), Place.Type.FINANCE);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8ad"), Place.Type.FIRE_STATION);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8ae"), Place.Type.FLOOR);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8af"), Place.Type.FLORIST);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8b0"), Place.Type.FOOD);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8b1"), Place.Type.FUNERAL_HOME);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8b2"), Place.Type.FURNITURE_STORE);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8b3"), Place.Type.GAS_STATION);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8b4"), Place.Type.GENERAL_CONTRACTOR);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8b5"), Place.Type.GEOCODE);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8b6"), Place.Type.GROCERY_OR_SUPERMARKET);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8b7"), Place.Type.GYM);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8b8"), Place.Type.HAIR_CARE);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8b9"), Place.Type.HARDWARE_STORE);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8ba"), Place.Type.HEALTH);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8bb"), Place.Type.HINDU_TEMPLE);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8bc"), Place.Type.HOME_GOODS_STORE);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8bd"), Place.Type.HOSPITAL);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8be"), Place.Type.INSURANCE_AGENCY);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8bf"), Place.Type.INTERSECTION);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8c0"), Place.Type.JEWELRY_STORE);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8c1"), Place.Type.LAUNDRY);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8c2"), Place.Type.LAWYER);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8c3"), Place.Type.LIBRARY);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8c4"), Place.Type.LIGHT_RAIL_STATION);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8c5"), Place.Type.LIQUOR_STORE);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8c6"), Place.Type.LOCAL_GOVERNMENT_OFFICE);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8c7"), Place.Type.LOCALITY);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8c8"), Place.Type.LOCKSMITH);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8c9"), Place.Type.LODGING);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8ca"), Place.Type.MEAL_DELIVERY);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8cb"), Place.Type.MEAL_TAKEAWAY);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8cc"), Place.Type.MOSQUE);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8cd"), Place.Type.MOVIE_RENTAL);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8ce"), Place.Type.MOVIE_THEATER);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8cf"), Place.Type.MOVING_COMPANY);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8d0"), Place.Type.MUSEUM);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8d1"), Place.Type.NATURAL_FEATURE);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8d2"), Place.Type.NEIGHBORHOOD);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8d3"), Place.Type.NIGHT_CLUB);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8d4"), Place.Type.PAINTER);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8d5"), Place.Type.PARK);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8d6"), Place.Type.PARKING);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8d7"), Place.Type.PET_STORE);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8d8"), Place.Type.PHARMACY);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8d9"), Place.Type.PHYSIOTHERAPIST);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8da"), Place.Type.PLACE_OF_WORSHIP);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8db"), Place.Type.PLUMBER);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8dc"), Place.Type.PLUS_CODE);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8dd"), Place.Type.POINT_OF_INTEREST);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8de"), Place.Type.POLICE);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8df"), Place.Type.POLITICAL);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8e0"), Place.Type.POST_BOX);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8e1"), Place.Type.POST_OFFICE);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8e2"), Place.Type.POSTAL_CODE_PREFIX);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8e3"), Place.Type.POSTAL_CODE_SUFFIX);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8e4"), Place.Type.POSTAL_CODE);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8e5"), Place.Type.POSTAL_TOWN);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8e6"), Place.Type.PREMISE);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8e7"), Place.Type.PRIMARY_SCHOOL);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8e8"), Place.Type.REAL_ESTATE_AGENCY);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8e9"), Place.Type.RESTAURANT);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8ea"), Place.Type.ROOFING_CONTRACTOR);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8eb"), Place.Type.ROOM);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8ec"), Place.Type.ROUTE);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8ed"), Place.Type.RV_PARK);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8ee"), Place.Type.SCHOOL);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8ef"), Place.Type.SECONDARY_SCHOOL);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8f0"), Place.Type.SHOE_STORE);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8f1"), Place.Type.SHOPPING_MALL);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8f2"), Place.Type.SPA);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8f3"), Place.Type.STADIUM);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8f4"), Place.Type.STORAGE);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8f5"), Place.Type.STORE);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8f6"), Place.Type.STREET_ADDRESS);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8f7"), Place.Type.STREET_NUMBER);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8f8"), Place.Type.SUBLOCALITY_LEVEL_1);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8f9"), Place.Type.SUBLOCALITY_LEVEL_2);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8fa"), Place.Type.SUBLOCALITY_LEVEL_3);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8fb"), Place.Type.SUBLOCALITY_LEVEL_4);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8fc"), Place.Type.SUBLOCALITY_LEVEL_5);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8fd"), Place.Type.SUBLOCALITY);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8fe"), Place.Type.SUBPREMISE);
        zzhuVar2.zza(ProtectedSandApp.s("\ue8ff"), Place.Type.SUBWAY_STATION);
        zzhuVar2.zza(ProtectedSandApp.s("\ue900"), Place.Type.SUPERMARKET);
        zzhuVar2.zza(ProtectedSandApp.s("\ue901"), Place.Type.SYNAGOGUE);
        zzhuVar2.zza(ProtectedSandApp.s("\ue902"), Place.Type.TAXI_STAND);
        zzhuVar2.zza(ProtectedSandApp.s("\ue903"), Place.Type.TOURIST_ATTRACTION);
        zzhuVar2.zza(ProtectedSandApp.s("\ue904"), Place.Type.TOWN_SQUARE);
        zzhuVar2.zza(ProtectedSandApp.s("\ue905"), Place.Type.TRAIN_STATION);
        zzhuVar2.zza(ProtectedSandApp.s("\ue906"), Place.Type.TRANSIT_STATION);
        zzhuVar2.zza(ProtectedSandApp.s("\ue907"), Place.Type.TRAVEL_AGENCY);
        zzhuVar2.zza(ProtectedSandApp.s("\ue908"), Place.Type.UNIVERSITY);
        zzhuVar2.zza(ProtectedSandApp.s("\ue909"), Place.Type.VETERINARY_CARE);
        zzhuVar2.zza(ProtectedSandApp.s("\ue90a"), Place.Type.ZOO);
        zzb = zzhuVar2.zzb();
    }

    zzds() {
    }

    static List zza(@q0 List list) {
        return list != null ? list : new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @q0
    static List zzb(@q0 List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        boolean z4 = false;
        zziq listIterator = ((zzhs) list).listIterator(0);
        while (listIterator.hasNext()) {
            String str = (String) listIterator.next();
            zzhv zzhvVar = zzb;
            if (zzhvVar.containsKey(str)) {
                arrayList.add((Place.Type) zzhvVar.get(str));
            } else {
                z4 = true;
            }
        }
        if (z4) {
            arrayList.add(Place.Type.OTHER);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static final com.google.android.libraries.places.api.model.Place zzc(@androidx.annotation.q0 com.google.android.libraries.places.internal.zzdv r13, @androidx.annotation.q0 java.util.List r14) throws com.google.android.gms.common.api.ApiException {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzds.zzc(com.google.android.libraries.places.internal.zzdv, java.util.List):com.google.android.libraries.places.api.model.Place");
    }

    private static ApiException zzd(String str) {
        String valueOf = String.valueOf(str);
        int length = valueOf.length();
        String s4 = ProtectedSandApp.s("\ue90f");
        return new ApiException(new Status(8, length != 0 ? s4.concat(valueOf) : new String(s4)));
    }

    @q0
    private static LatLng zze(@q0 zzdv.zzb.zza zzaVar) {
        if (zzaVar == null) {
            return null;
        }
        Double zza2 = zzaVar.zza();
        Double zzb2 = zzaVar.zzb();
        if (zza2 == null || zzb2 == null) {
            return null;
        }
        return new LatLng(zza2.doubleValue(), zzb2.doubleValue());
    }

    @q0
    private static TimeOfWeek zzf(@q0 zzdv.zzc.zzb zzbVar) {
        DayOfWeek dayOfWeek;
        if (zzbVar == null) {
            return null;
        }
        try {
            Integer zza2 = zzbVar.zza();
            zzha.zzc(zza2, ProtectedSandApp.s("\ue910"));
            String zzb2 = zzbVar.zzb();
            zzha.zzc(zzb2, ProtectedSandApp.s("\ue911"));
            String format = String.format(ProtectedSandApp.s("\ue912"), zzb2);
            zzha.zze(zzb2.length() == 4, format);
            try {
                LocalTime newInstance = LocalTime.newInstance(Integer.parseInt(zzb2.substring(0, 2)), Integer.parseInt(zzb2.substring(2, 4)));
                switch (zza2.intValue()) {
                    case 0:
                        dayOfWeek = DayOfWeek.SUNDAY;
                        break;
                    case 1:
                        dayOfWeek = DayOfWeek.MONDAY;
                        break;
                    case 2:
                        dayOfWeek = DayOfWeek.TUESDAY;
                        break;
                    case 3:
                        dayOfWeek = DayOfWeek.WEDNESDAY;
                        break;
                    case 4:
                        dayOfWeek = DayOfWeek.THURSDAY;
                        break;
                    case 5:
                        dayOfWeek = DayOfWeek.FRIDAY;
                        break;
                    case 6:
                        dayOfWeek = DayOfWeek.SATURDAY;
                        break;
                    default:
                        throw new IllegalArgumentException(ProtectedSandApp.s("\ue913"));
                }
                return TimeOfWeek.newInstance(dayOfWeek, newInstance);
            } catch (NumberFormatException e4) {
                throw new IllegalArgumentException(format, e4);
            }
        } catch (NullPointerException e5) {
            throw new IllegalArgumentException(e5.getMessage(), e5);
        }
    }

    private static boolean zzg(Collection collection, @q0 Object obj) {
        if (obj != null) {
            return collection.add(obj);
        }
        return false;
    }
}
