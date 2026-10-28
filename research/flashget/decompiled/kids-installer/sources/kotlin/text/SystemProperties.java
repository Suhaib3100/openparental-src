package kotlin.text;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: StringBuilderJVM.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlin/text/SystemProperties;", "", "()V", "LINE_SEPARATOR", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.text.k0, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
final class SystemProperties {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final SystemProperties f27121a = new SystemProperties();

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final String f27122b;

    static {
        String property = System.getProperty(ProtectedSandApp.s("孅"));
        kotlin.jvm.internal.l0.m(property);
        f27122b = property;
    }

    private SystemProperties() {
    }
}
