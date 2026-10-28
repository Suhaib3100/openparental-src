package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Arrays;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: JvmMetadataVersion.kt */
/* loaded from: classes5.dex */
public final class e extends kotlin.reflect.jvm.internal.impl.metadata.deserialization.a {

    /* renamed from: h, reason: collision with root package name */
    @d5.d
    public static final a f25564h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final e f25565i = new e(1, 8, 0);

    /* renamed from: j, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final e f25566j = new e(new int[0]);

    /* renamed from: g, reason: collision with root package name */
    private final boolean f25567g;

    /* compiled from: JvmMetadataVersion.kt */
    public static final class a {
        private a() {
        }

        public a(w wVar) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@d5.d int[] iArr, boolean z5) {
        super(Arrays.copyOf(iArr, iArr.length));
        l0.p(iArr, ProtectedSandApp.s("䷚"));
        this.f25567g = z5;
    }

    public boolean h() {
        boolean z5;
        if (a() == 1 && b() == 0) {
            return false;
        }
        if (this.f25567g) {
            z5 = f(f25565i);
        } else {
            int a6 = a();
            e eVar = f25565i;
            z5 = a6 == eVar.a() && b() <= eVar.b() + 1;
        }
        return z5;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(@d5.d int... iArr) {
        this(iArr, false);
        l0.p(iArr, ProtectedSandApp.s("䷙"));
    }
}
