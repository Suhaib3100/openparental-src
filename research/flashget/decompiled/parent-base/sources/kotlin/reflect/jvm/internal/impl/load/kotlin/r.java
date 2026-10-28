package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;

/* compiled from: KotlinClassFinder.kt */
/* loaded from: classes7.dex */
public interface r extends kotlin.reflect.jvm.internal.impl.serialization.deserialization.v {

    /* compiled from: KotlinClassFinder.kt */
    public static abstract class a {

        /* compiled from: KotlinClassFinder.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.r$a$a, reason: collision with other inner class name */
        public static final class C1109a extends a {

            /* renamed from: a, reason: collision with root package name */
            @fg.l
            private final byte[] f76949a;

            @fg.l
            public final byte[] b() {
                return this.f76949a;
            }
        }

        /* compiled from: KotlinClassFinder.kt */
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @fg.l
            private final t f76950a;

            /* renamed from: b, reason: collision with root package name */
            @fg.m
            private final byte[] f76951b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(@fg.l t tVar, @fg.m byte[] bArr) {
                super(null);
                l0.p(tVar, ProtectedSandApp.s("璣\u0001"));
                this.f76950a = tVar;
                this.f76951b = bArr;
            }

            @fg.l
            public final t b() {
                return this.f76950a;
            }

            public /* synthetic */ b(t tVar, byte[] bArr, int i4, kotlin.jvm.internal.w wVar) {
                this(tVar, (i4 & 2) != 0 ? null : bArr);
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.w wVar) {
            this();
        }

        @fg.m
        public final t a() {
            b bVar = this instanceof b ? (b) this : null;
            if (bVar != null) {
                return bVar.b();
            }
            return null;
        }

        private a() {
        }
    }

    @fg.m
    a a(@fg.l kotlin.reflect.jvm.internal.impl.name.b bVar, @fg.l kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e eVar);

    @fg.m
    a b(@fg.l wd.g gVar, @fg.l kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e eVar);
}
