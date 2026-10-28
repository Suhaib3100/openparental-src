package w3;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: AdditionalClassPartsProvider.kt */
/* loaded from: classes5.dex */
public interface a {

    /* compiled from: AdditionalClassPartsProvider.kt */
    /* renamed from: w3.a$a, reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0517a implements a {

        /* renamed from: a, reason: collision with root package name */
        @d5.d
        public static final C0517a f34018a = new C0517a();

        private C0517a() {
        }

        @Override // w3.a
        @d5.d
        public Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> a(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
            l0.p(eVar, ProtectedSandApp.s("鑲"));
            return EmptyList.f23167o;
        }

        @Override // w3.a
        @d5.d
        public Collection<z0> b(@d5.d f fVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
            l0.p(fVar, ProtectedSandApp.s("鑳"));
            l0.p(eVar, ProtectedSandApp.s("鑴"));
            return EmptyList.f23167o;
        }

        @Override // w3.a
        @d5.d
        public Collection<h0> d(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
            l0.p(eVar, ProtectedSandApp.s("鑵"));
            return EmptyList.f23167o;
        }

        @Override // w3.a
        @d5.d
        public Collection<f> e(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
            l0.p(eVar, ProtectedSandApp.s("鑶"));
            return EmptyList.f23167o;
        }
    }

    @d5.d
    Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> a(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar);

    @d5.d
    Collection<z0> b(@d5.d f fVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar);

    @d5.d
    Collection<h0> d(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar);

    @d5.d
    Collection<f> e(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar);
}
