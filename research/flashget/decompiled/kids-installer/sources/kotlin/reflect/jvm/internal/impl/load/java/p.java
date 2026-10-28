package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Arrays;
import java.util.Set;
import kotlin.jvm.internal.l0;

/* compiled from: JavaClassFinder.kt */
/* loaded from: classes5.dex */
public interface p {
    @d5.e
    b4.g a(@d5.d a aVar);

    @d5.e
    Set<String> b(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar);

    @d5.e
    b4.u c(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar, boolean z5);

    /* compiled from: JavaClassFinder.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @d5.d
        private final kotlin.reflect.jvm.internal.impl.name.b f24810a;

        /* renamed from: b, reason: collision with root package name */
        @d5.e
        private final byte[] f24811b;

        /* renamed from: c, reason: collision with root package name */
        @d5.e
        private final b4.g f24812c;

        public a(@d5.d kotlin.reflect.jvm.internal.impl.name.b bVar, @d5.e byte[] bArr, @d5.e b4.g gVar) {
            l0.p(bVar, ProtectedSandApp.s("䫋"));
            this.f24810a = bVar;
            this.f24811b = bArr;
            this.f24812c = gVar;
        }

        @d5.d
        public final kotlin.reflect.jvm.internal.impl.name.b a() {
            return this.f24810a;
        }

        public boolean equals(@d5.e Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l0.g(this.f24810a, aVar.f24810a) && l0.g(this.f24811b, aVar.f24811b) && l0.g(this.f24812c, aVar.f24812c);
        }

        public int hashCode() {
            int hashCode = this.f24810a.hashCode() * 31;
            byte[] bArr = this.f24811b;
            int hashCode2 = (hashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            b4.g gVar = this.f24812c;
            return hashCode2 + (gVar != null ? gVar.hashCode() : 0);
        }

        @d5.d
        public String toString() {
            return ProtectedSandApp.s("䫌") + this.f24810a + ProtectedSandApp.s("䫍") + Arrays.toString(this.f24811b) + ProtectedSandApp.s("䫎") + this.f24812c + ')';
        }

        public /* synthetic */ a(kotlin.reflect.jvm.internal.impl.name.b bVar, byte[] bArr, b4.g gVar, int i5, kotlin.jvm.internal.w wVar) {
            this(bVar, (i5 & 2) != 0 ? null : bArr, (i5 & 4) != 0 ? null : gVar);
        }
    }
}
