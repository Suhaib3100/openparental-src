package h0;

import java.util.HashMap;
import kotlin.Metadata;
import kotlin.collections.z0;
import kotlin.jvm.internal.r1;
import kotlin.q0;

/* compiled from: AndroidAutofillType.android.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\"6\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002`\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0004\u0010\u0006\"\u001e\u0010\f\u001a\u00020\u0002*\u00020\u00018@X\u0081\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Ljava/util/HashMap;", "Lh0/b0;", "", "Lkotlin/collections/HashMap;", "a", "Ljava/util/HashMap;", "()V", "androidAutofillTypes", "b", "(Lh0/b0;)Ljava/lang/String;", "c", "(Lh0/b0;)V", "androidType", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAndroidAutofillType.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAutofillType.android.kt\nandroidx/compose/ui/autofill/AndroidAutofillType_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"})
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final HashMap<b0, String> f73921a = z0.M(new q0(b0.EmailAddress, "emailAddress"), new q0(b0.Username, "username"), new q0(b0.Password, "password"), new q0(b0.NewUsername, "newUsername"), new q0(b0.NewPassword, "newPassword"), new q0(b0.PostalAddress, "postalAddress"), new q0(b0.PostalCode, "postalCode"), new q0(b0.CreditCardNumber, "creditCardNumber"), new q0(b0.CreditCardSecurityCode, "creditCardSecurityCode"), new q0(b0.CreditCardExpirationDate, "creditCardExpirationDate"), new q0(b0.CreditCardExpirationMonth, "creditCardExpirationMonth"), new q0(b0.CreditCardExpirationYear, "creditCardExpirationYear"), new q0(b0.CreditCardExpirationDay, "creditCardExpirationDay"), new q0(b0.AddressCountry, "addressCountry"), new q0(b0.AddressRegion, "addressRegion"), new q0(b0.AddressLocality, "addressLocality"), new q0(b0.AddressStreet, "streetAddress"), new q0(b0.AddressAuxiliaryDetails, "extendedAddress"), new q0(b0.PostalCodeExtended, "extendedPostalCode"), new q0(b0.PersonFullName, "personName"), new q0(b0.PersonFirstName, "personGivenName"), new q0(b0.PersonLastName, "personFamilyName"), new q0(b0.PersonMiddleName, "personMiddleName"), new q0(b0.PersonMiddleInitial, "personMiddleInitial"), new q0(b0.PersonNamePrefix, "personNamePrefix"), new q0(b0.PersonNameSuffix, "personNameSuffix"), new q0(b0.PhoneNumber, "phoneNumber"), new q0(b0.PhoneNumberDevice, "phoneNumberDevice"), new q0(b0.PhoneCountryCode, "phoneCountryCode"), new q0(b0.PhoneNumberNational, "phoneNational"), new q0(b0.Gender, "gender"), new q0(b0.BirthDateFull, "birthDateFull"), new q0(b0.BirthDateDay, "birthDateDay"), new q0(b0.BirthDateMonth, "birthDateMonth"), new q0(b0.BirthDateYear, "birthDateYear"), new q0(b0.SmsOtpCode, "smsOTPCode"));

    @androidx.compose.ui.k
    private static /* synthetic */ void a() {
    }

    @fg.l
    public static final String b(@fg.l b0 b0Var) {
        String str = f73921a.get(b0Var);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Unsupported autofill type");
    }

    @androidx.compose.ui.k
    public static /* synthetic */ void c(b0 b0Var) {
    }
}
