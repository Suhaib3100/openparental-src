package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;

/* compiled from: KotlinClassFinder.kt */
/* loaded from: classes5.dex */
public interface p extends kotlin.reflect.jvm.internal.impl.serialization.deserialization.u {

    /* compiled from: KotlinClassFinder.kt */
    public static abstract class a {

        /* compiled from: KotlinClassFinder.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.p$a$a, reason: collision with other inner class name */
        public static final class C0304a extends a {

            /* renamed from: a, reason: collision with root package name */
            @d5.d
            private final byte[] f25067a;

            @d5.d
            public final byte[] b() {
                return this.f25067a;
            }
        }

        /* compiled from: KotlinClassFinder.kt */
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @d5.d
            private final r f25068a;

            /* renamed from: b, reason: collision with root package name */
            @d5.e
            private final byte[] f25069b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(@d5.d r rVar, @d5.e byte[] bArr) {
                super(null);
                l0.p(rVar, ProtectedSandApp.s("䲨"));
                this.f25068a = rVar;
                this.f25069b = bArr;
            }

            @d5.d
            public final r b() {
                return this.f25068a;
            }

            public /* synthetic */ b(r rVar, byte[] bArr, int i5, kotlin.jvm.internal.w wVar) {
                this(rVar, (i5 & 2) != 0 ? null : bArr);
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.w wVar) {
            this();
        }

        @d5.e
        public final r a() {
            b bVar = this instanceof b ? (b) this : null;
            if (bVar != null) {
                return bVar.b();
            }
            return null;
        }

        private a() {
        }
    }

    @d5.e
    a b(@d5.d kotlin.reflect.jvm.internal.impl.name.b bVar);

    @d5.e
    a c(@d5.d b4.g gVar);
}
