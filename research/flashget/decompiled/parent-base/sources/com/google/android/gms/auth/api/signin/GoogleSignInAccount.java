package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.collection.d;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import f9.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@SafeParcelable.Class(creator = "GoogleSignInAccountCreator")
@Deprecated
/* loaded from: classes5.dex */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {

    @o0
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new zab();

    @o0
    @m1
    public static final Clock zaa = DefaultClock.getInstance();

    @SafeParcelable.VersionField(id = 1)
    final int zab;

    @SafeParcelable.Field(id = 10)
    final List zac;

    @q0
    @SafeParcelable.Field(getter = "getId", id = 2)
    private final String zad;

    @q0
    @SafeParcelable.Field(getter = "getIdToken", id = 3)
    private final String zae;

    @q0
    @SafeParcelable.Field(getter = "getEmail", id = 4)
    private final String zaf;

    @q0
    @SafeParcelable.Field(getter = "getDisplayName", id = 5)
    private final String zag;

    @q0
    @SafeParcelable.Field(getter = "getPhotoUrl", id = 6)
    private final Uri zah;

    @q0
    @SafeParcelable.Field(getter = "getServerAuthCode", id = 7)
    private String zai;

    @SafeParcelable.Field(getter = "getExpirationTimeSecs", id = 8)
    private final long zaj;

    @SafeParcelable.Field(getter = "getObfuscatedIdentifier", id = 9)
    private final String zak;

    @q0
    @SafeParcelable.Field(getter = "getGivenName", id = 11)
    private final String zal;

    @q0
    @SafeParcelable.Field(getter = "getFamilyName", id = 12)
    private final String zam;
    private final Set zan = new HashSet();

    @SafeParcelable.Constructor
    GoogleSignInAccount(@SafeParcelable.Param(id = 1) int i4, @q0 @SafeParcelable.Param(id = 2) String str, @q0 @SafeParcelable.Param(id = 3) String str2, @q0 @SafeParcelable.Param(id = 4) String str3, @q0 @SafeParcelable.Param(id = 5) String str4, @q0 @SafeParcelable.Param(id = 6) Uri uri, @q0 @SafeParcelable.Param(id = 7) String str5, @SafeParcelable.Param(id = 8) long j4, @SafeParcelable.Param(id = 9) String str6, @SafeParcelable.Param(id = 10) List list, @q0 @SafeParcelable.Param(id = 11) String str7, @q0 @SafeParcelable.Param(id = 12) String str8) {
        this.zab = i4;
        this.zad = str;
        this.zae = str2;
        this.zaf = str3;
        this.zag = str4;
        this.zah = uri;
        this.zai = str5;
        this.zaj = j4;
        this.zak = str6;
        this.zac = list;
        this.zal = str7;
        this.zam = str8;
    }

    @o0
    @KeepForSdk
    public static GoogleSignInAccount createDefault() {
        return zae(new Account(ProtectedSandApp.s("쟰"), ProtectedSandApp.s("쟱")), new HashSet());
    }

    @o0
    @KeepForSdk
    public static GoogleSignInAccount fromAccount(@o0 Account account) {
        return zae(account, new d());
    }

    @ShowFirstParty
    @o0
    @KeepForSdk
    public static GoogleSignInAccount fromAccountAndScopes(@o0 Account account, @o0 Scope scope, @o0 Scope... scopeArr) {
        Preconditions.checkNotNull(account);
        Preconditions.checkNotNull(scope);
        HashSet hashSet = new HashSet();
        hashSet.add(scope);
        hashSet.addAll(Arrays.asList(scopeArr));
        return zae(account, hashSet);
    }

    @o0
    public static GoogleSignInAccount zaa(@q0 String str, @q0 String str2, @q0 String str3, @q0 String str4, @q0 String str5, @q0 String str6, @q0 Uri uri, @q0 Long l4, @o0 String str7, @o0 Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l4.longValue(), Preconditions.checkNotEmpty(str7), new ArrayList((Collection) Preconditions.checkNotNull(set)), str5, str6);
    }

    @q0
    public static GoogleSignInAccount zab(@q0 String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString(ProtectedSandApp.s("쟲"));
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString(ProtectedSandApp.s("쟳")));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray(ProtectedSandApp.s("쟴"));
        int length = jSONArray.length();
        for (int i4 = 0; i4 < length; i4++) {
            hashSet.add(new Scope(jSONArray.getString(i4)));
        }
        String optString2 = jSONObject.optString(ProtectedSandApp.s("쟵"));
        String s4 = ProtectedSandApp.s("쟶");
        String optString3 = jSONObject.has(s4) ? jSONObject.optString(s4) : null;
        String s5 = ProtectedSandApp.s("쟷");
        String optString4 = jSONObject.has(s5) ? jSONObject.optString(s5) : null;
        String s6 = ProtectedSandApp.s("쟸");
        String optString5 = jSONObject.has(s6) ? jSONObject.optString(s6) : null;
        String s7 = ProtectedSandApp.s("쟹");
        String optString6 = jSONObject.has(s7) ? jSONObject.optString(s7) : null;
        String s10 = ProtectedSandApp.s("쟺");
        GoogleSignInAccount zaa2 = zaa(optString2, optString3, optString4, optString5, optString6, jSONObject.has(s10) ? jSONObject.optString(s10) : null, parse, Long.valueOf(parseLong), jSONObject.getString(ProtectedSandApp.s("쟻")), hashSet);
        String s11 = ProtectedSandApp.s("쟼");
        zaa2.zai = jSONObject.has(s11) ? jSONObject.optString(s11) : null;
        return zaa2;
    }

    private static GoogleSignInAccount zae(Account account, Set set) {
        return zaa(null, null, account.name, null, null, null, null, 0L, account.name, set);
    }

    public boolean equals(@q0 Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.zak.equals(this.zak) && googleSignInAccount.getRequestedScopes().equals(getRequestedScopes());
    }

    @q0
    public Account getAccount() {
        String str = this.zaf;
        if (str == null) {
            return null;
        }
        return new Account(str, ProtectedSandApp.s("쟱"));
    }

    @q0
    public String getDisplayName() {
        return this.zag;
    }

    @q0
    public String getEmail() {
        return this.zaf;
    }

    @q0
    public String getFamilyName() {
        return this.zam;
    }

    @q0
    public String getGivenName() {
        return this.zal;
    }

    @o0
    public Set<Scope> getGrantedScopes() {
        return new HashSet(this.zac);
    }

    @q0
    public String getId() {
        return this.zad;
    }

    @q0
    public String getIdToken() {
        return this.zae;
    }

    @q0
    public Uri getPhotoUrl() {
        return this.zah;
    }

    @o0
    @KeepForSdk
    public Set<Scope> getRequestedScopes() {
        HashSet hashSet = new HashSet(this.zac);
        hashSet.addAll(this.zan);
        return hashSet;
    }

    @q0
    public String getServerAuthCode() {
        return this.zai;
    }

    public int hashCode() {
        return ((this.zak.hashCode() + 527) * 31) + getRequestedScopes().hashCode();
    }

    @KeepForSdk
    public boolean isExpired() {
        return zaa.currentTimeMillis() / 1000 >= this.zaj + (-300);
    }

    @o0
    @KeepForSdk
    @a
    public GoogleSignInAccount requestExtraScopes(@o0 Scope... scopeArr) {
        if (scopeArr != null) {
            Collections.addAll(this.zan, scopeArr);
        }
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zab);
        SafeParcelWriter.writeString(parcel, 2, getId(), false);
        SafeParcelWriter.writeString(parcel, 3, getIdToken(), false);
        SafeParcelWriter.writeString(parcel, 4, getEmail(), false);
        SafeParcelWriter.writeString(parcel, 5, getDisplayName(), false);
        SafeParcelWriter.writeParcelable(parcel, 6, getPhotoUrl(), i4, false);
        SafeParcelWriter.writeString(parcel, 7, getServerAuthCode(), false);
        SafeParcelWriter.writeLong(parcel, 8, this.zaj);
        SafeParcelWriter.writeString(parcel, 9, this.zak, false);
        SafeParcelWriter.writeTypedList(parcel, 10, this.zac, false);
        SafeParcelWriter.writeString(parcel, 11, getGivenName(), false);
        SafeParcelWriter.writeString(parcel, 12, getFamilyName(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @o0
    public final String zac() {
        return this.zak;
    }

    @o0
    public final String zad() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (getId() != null) {
                jSONObject.put(ProtectedSandApp.s("쟵"), getId());
            }
            if (getIdToken() != null) {
                jSONObject.put(ProtectedSandApp.s("쟶"), getIdToken());
            }
            if (getEmail() != null) {
                jSONObject.put(ProtectedSandApp.s("쟷"), getEmail());
            }
            if (getDisplayName() != null) {
                jSONObject.put(ProtectedSandApp.s("쟸"), getDisplayName());
            }
            if (getGivenName() != null) {
                jSONObject.put(ProtectedSandApp.s("쟹"), getGivenName());
            }
            if (getFamilyName() != null) {
                jSONObject.put(ProtectedSandApp.s("쟺"), getFamilyName());
            }
            Uri photoUrl = getPhotoUrl();
            if (photoUrl != null) {
                jSONObject.put(ProtectedSandApp.s("쟲"), photoUrl.toString());
            }
            String serverAuthCode = getServerAuthCode();
            String s4 = ProtectedSandApp.s("쟼");
            if (serverAuthCode != null) {
                jSONObject.put(s4, getServerAuthCode());
            }
            jSONObject.put(ProtectedSandApp.s("쟳"), this.zaj);
            jSONObject.put(ProtectedSandApp.s("쟻"), this.zak);
            JSONArray jSONArray = new JSONArray();
            List list = this.zac;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, new Comparator() { // from class: com.google.android.gms.auth.api.signin.zaa
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
                    return ((Scope) obj).getScopeUri().compareTo(((Scope) obj2).getScopeUri());
                }
            });
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.getScopeUri());
            }
            jSONObject.put(ProtectedSandApp.s("쟴"), jSONArray);
            jSONObject.remove(s4);
            return jSONObject.toString();
        } catch (JSONException e4) {
            throw new RuntimeException(e4);
        }
    }
}
