package k;

import androidx.annotation.o0;
import androidx.core.util.w;

/* compiled from: HintConstants.java */
/* loaded from: classes.dex */
public final class a {
    public static final String A = "phoneNumber";
    public static final String B = "phoneNumberDevice";
    public static final String C = "phoneCountryCode";
    public static final String D = "phoneNational";
    public static final String E = "newUsername";
    public static final String F = "newPassword";
    public static final String G = "gender";
    public static final String H = "birthDateFull";
    public static final String I = "birthDateDay";
    public static final String J = "birthDateMonth";
    public static final String K = "birthDateYear";
    public static final String L = "smsOTPCode";

    /* renamed from: a, reason: collision with root package name */
    public static final String f74641a = "emailAddress";

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final String f74642b = "name";

    /* renamed from: c, reason: collision with root package name */
    public static final String f74643c = "username";

    /* renamed from: d, reason: collision with root package name */
    public static final String f74644d = "password";

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final String f74645e = "phone";

    /* renamed from: f, reason: collision with root package name */
    public static final String f74646f = "postalAddress";

    /* renamed from: g, reason: collision with root package name */
    public static final String f74647g = "postalCode";

    /* renamed from: h, reason: collision with root package name */
    public static final String f74648h = "creditCardNumber";

    /* renamed from: i, reason: collision with root package name */
    public static final String f74649i = "creditCardSecurityCode";

    /* renamed from: j, reason: collision with root package name */
    public static final String f74650j = "creditCardExpirationDate";

    /* renamed from: k, reason: collision with root package name */
    public static final String f74651k = "creditCardExpirationMonth";

    /* renamed from: l, reason: collision with root package name */
    public static final String f74652l = "creditCardExpirationYear";

    /* renamed from: m, reason: collision with root package name */
    public static final String f74653m = "creditCardExpirationDay";

    /* renamed from: n, reason: collision with root package name */
    public static final String f74654n = "addressCountry";

    /* renamed from: o, reason: collision with root package name */
    public static final String f74655o = "addressRegion";

    /* renamed from: p, reason: collision with root package name */
    public static final String f74656p = "addressLocality";

    /* renamed from: q, reason: collision with root package name */
    public static final String f74657q = "streetAddress";

    /* renamed from: r, reason: collision with root package name */
    public static final String f74658r = "extendedAddress";

    /* renamed from: s, reason: collision with root package name */
    public static final String f74659s = "extendedPostalCode";

    /* renamed from: t, reason: collision with root package name */
    public static final String f74660t = "personName";

    /* renamed from: u, reason: collision with root package name */
    public static final String f74661u = "personGivenName";

    /* renamed from: v, reason: collision with root package name */
    public static final String f74662v = "personFamilyName";

    /* renamed from: w, reason: collision with root package name */
    public static final String f74663w = "personMiddleName";

    /* renamed from: x, reason: collision with root package name */
    public static final String f74664x = "personMiddleInitial";

    /* renamed from: y, reason: collision with root package name */
    public static final String f74665y = "personNamePrefix";

    /* renamed from: z, reason: collision with root package name */
    public static final String f74666z = "personNameSuffix";

    private a() {
    }

    @o0
    public static String a(int i4) {
        w.g(i4, 1, 8, "characterPosition");
        return ("smsOTPCode" + i4).intern();
    }
}
