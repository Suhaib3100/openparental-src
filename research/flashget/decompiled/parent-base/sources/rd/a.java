package rd;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.util.Collection;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: AdditionalClassPartsProvider.kt */
/* loaded from: classes7.dex */
public interface a {

    /* compiled from: AdditionalClassPartsProvider.kt */
    /* renamed from: rd.a$a, reason: collision with other inner class name */
    public static final class C1384a implements a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public static final C1384a f89864a = new C1384a();

        private C1384a() {
        }

        @Override // rd.a
        @l
        public Collection<z0> a(@l f fVar, @l e eVar) {
            l0.p(fVar, ProtectedSandApp.s("ꋺ\u0001"));
            l0.p(eVar, ProtectedSandApp.s("ꋻ\u0001"));
            return j0.f74919b;
        }

        @Override // rd.a
        @l
        public Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> c(@l e eVar) {
            l0.p(eVar, ProtectedSandApp.s("ꋻ\u0001"));
            return j0.f74919b;
        }

        @Override // rd.a
        @l
        public Collection<h0> d(@l e eVar) {
            l0.p(eVar, ProtectedSandApp.s("ꋻ\u0001"));
            return j0.f74919b;
        }

        @Override // rd.a
        @l
        public Collection<f> e(@l e eVar) {
            l0.p(eVar, ProtectedSandApp.s("ꋻ\u0001"));
            return j0.f74919b;
        }
    }

    @l
    Collection<z0> a(@l f fVar, @l e eVar);

    @l
    Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> c(@l e eVar);

    @l
    Collection<h0> d(@l e eVar);

    @l
    Collection<f> e(@l e eVar);
}
