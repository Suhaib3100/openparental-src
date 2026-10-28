package kotlin.reflect.jvm.internal.impl.resolve.constants;

import androidx.collection.y0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.types.h1;

/* compiled from: IntegerValueTypeConstructor.kt */
/* loaded from: classes7.dex */
public final class p implements h1 {

    /* renamed from: a, reason: collision with root package name */
    private final long f77891a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final h0 f77892b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final ArrayList<kotlin.reflect.jvm.internal.impl.types.h0> f77893c;

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @fg.l
    public h1 a(@fg.l kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        l0.p(gVar, ProtectedSandApp.s("磊\u0001"));
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    public kotlin.reflect.jvm.internal.impl.descriptors.h c() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    public boolean d() {
        return false;
    }

    @fg.m
    public Void e() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @fg.l
    public List<f1> getParameters() {
        return j0.f74919b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @fg.l
    public Collection<kotlin.reflect.jvm.internal.impl.types.h0> j() {
        return this.f77893c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @fg.l
    public kotlin.reflect.jvm.internal.impl.builtins.h p() {
        return this.f77892b.p();
    }

    @fg.l
    public String toString() {
        return y0.a(new StringBuilder(ProtectedSandApp.s("磋\u0001")), this.f77891a, ')');
    }
}
