package kotlin.text;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: StringBuilderJVM.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkotlin/text/k0;", "", "<init>", "()V", "", "b", "Ljava/lang/String;", "LINE_SEPARATOR", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class k0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final k0 f79134a = new k0();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public static final String LINE_SEPARATOR;

    static {
        String property = System.getProperty(ProtectedSandApp.s("蒹\u0001"));
        kotlin.jvm.internal.l0.m(property);
        LINE_SEPARATOR = property;
    }

    private k0() {
    }
}
