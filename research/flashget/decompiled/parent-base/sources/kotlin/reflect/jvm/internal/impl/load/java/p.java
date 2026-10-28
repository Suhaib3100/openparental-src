package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;
import java.util.Set;
import kotlin.jvm.internal.l0;

/* compiled from: JavaClassFinder.kt */
/* loaded from: classes7.dex */
public interface p {
    @fg.m
    wd.g a(@fg.l a aVar);

    @fg.m
    wd.u b(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar, boolean z4);

    @fg.m
    Set<String> c(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar);

    /* compiled from: JavaClassFinder.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        private final kotlin.reflect.jvm.internal.impl.name.b f76685a;

        /* renamed from: b, reason: collision with root package name */
        @fg.m
        private final byte[] f76686b;

        /* renamed from: c, reason: collision with root package name */
        @fg.m
        private final wd.g f76687c;

        public a(@fg.l kotlin.reflect.jvm.internal.impl.name.b bVar, @fg.m byte[] bArr, @fg.m wd.g gVar) {
            l0.p(bVar, ProtectedSandApp.s("牤\u0001"));
            this.f76685a = bVar;
            this.f76686b = bArr;
            this.f76687c = gVar;
        }

        @fg.l
        public final kotlin.reflect.jvm.internal.impl.name.b a() {
            return this.f76685a;
        }

        public boolean equals(@fg.m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l0.g(this.f76685a, aVar.f76685a) && l0.g(this.f76686b, aVar.f76686b) && l0.g(this.f76687c, aVar.f76687c);
        }

        public int hashCode() {
            int hashCode = this.f76685a.hashCode() * 31;
            byte[] bArr = this.f76686b;
            int hashCode2 = (hashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            wd.g gVar = this.f76687c;
            return hashCode2 + (gVar != null ? gVar.hashCode() : 0);
        }

        @fg.l
        public String toString() {
            return ProtectedSandApp.s("牥\u0001") + this.f76685a + ProtectedSandApp.s("牦\u0001") + Arrays.toString(this.f76686b) + ProtectedSandApp.s("牧\u0001") + this.f76687c + ')';
        }

        public /* synthetic */ a(kotlin.reflect.jvm.internal.impl.name.b bVar, byte[] bArr, wd.g gVar, int i4, kotlin.jvm.internal.w wVar) {
            this(bVar, (i4 & 2) != 0 ? null : bArr, (i4 & 4) != 0 ? null : gVar);
        }
    }
}
