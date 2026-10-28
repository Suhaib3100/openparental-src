package com.google.maps.android.compose;

import androidx.compose.runtime.g3;
import androidx.compose.runtime.t3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.maps.GoogleMap;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: MapEffect.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0004\u001aH\u0010\t\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002-\u0010\b\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0002¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001aR\u0010\f\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u00002-\u0010\b\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0002¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\f\u0010\r\u001a\\\u0010\u000f\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u00002-\u0010\b\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0002¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001aV\u0010\u0013\u001a\u00020\u00062\u0016\u0010\u0012\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00000\u0011\"\u0004\u0018\u00010\u00002-\u0010\b\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0002¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"", "key1", "Lkotlin/Function3;", "Lkotlinx/coroutines/r0;", "Lcom/google/android/gms/maps/GoogleMap;", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "Lkotlin/u;", "block", "c", "(Ljava/lang/Object;Lld/q;Landroidx/compose/runtime/t;I)V", "key2", "b", "(Ljava/lang/Object;Ljava/lang/Object;Lld/q;Landroidx/compose/runtime/t;I)V", "key3", "a", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lld/q;Landroidx/compose/runtime/t;I)V", "", "keys", "d", "([Ljava/lang/Object;Lld/q;Landroidx/compose/runtime/t;I)V", "maps-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class n0 {

    /* compiled from: MapEffect.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.maps.android.compose.MapEffectKt$MapEffect$1", f = "MapEffect.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f61959b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f61960c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.q<kotlinx.coroutines.r0, GoogleMap, kotlin.coroutines.d<? super k2>, Object> f61961d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ GoogleMap f61962e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ld.q<? super kotlinx.coroutines.r0, ? super GoogleMap, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar, GoogleMap googleMap, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f61961d = qVar;
            this.f61962e = googleMap;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f61961d, this.f61962e, dVar);
            aVar.f61960c = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f61959b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                kotlinx.coroutines.r0 r0Var = (kotlinx.coroutines.r0) this.f61960c;
                ld.q<kotlinx.coroutines.r0, GoogleMap, kotlin.coroutines.d<? super k2>, Object> qVar = this.f61961d;
                GoogleMap googleMap = this.f61962e;
                this.f61959b = 1;
                if (qVar.R(r0Var, googleMap, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("ߒ\u0001"));
                }
                kotlin.a1.n(obj);
            }
            return k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: MapEffect.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f61963b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.q<kotlinx.coroutines.r0, GoogleMap, kotlin.coroutines.d<? super k2>, Object> f61964c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f61965d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Object obj, ld.q<? super kotlinx.coroutines.r0, ? super GoogleMap, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar, int i4) {
            super(2);
            this.f61963b = obj;
            this.f61964c = qVar;
            this.f61965d = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            n0.c(this.f61963b, this.f61964c, tVar, g3.b(this.f61965d | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: MapEffect.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.maps.android.compose.MapEffectKt$MapEffect$3", f = "MapEffect.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f61966b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f61967c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.q<kotlinx.coroutines.r0, GoogleMap, kotlin.coroutines.d<? super k2>, Object> f61968d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ GoogleMap f61969e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(ld.q<? super kotlinx.coroutines.r0, ? super GoogleMap, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar, GoogleMap googleMap, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f61968d = qVar;
            this.f61969e = googleMap;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.f61968d, this.f61969e, dVar);
            cVar.f61967c = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f61966b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                kotlinx.coroutines.r0 r0Var = (kotlinx.coroutines.r0) this.f61967c;
                ld.q<kotlinx.coroutines.r0, GoogleMap, kotlin.coroutines.d<? super k2>, Object> qVar = this.f61968d;
                GoogleMap googleMap = this.f61969e;
                this.f61966b = 1;
                if (qVar.R(r0Var, googleMap, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("ߓ\u0001"));
                }
                kotlin.a1.n(obj);
            }
            return k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((c) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: MapEffect.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f61970b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f61971c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.q<kotlinx.coroutines.r0, GoogleMap, kotlin.coroutines.d<? super k2>, Object> f61972d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f61973e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Object obj, Object obj2, ld.q<? super kotlinx.coroutines.r0, ? super GoogleMap, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar, int i4) {
            super(2);
            this.f61970b = obj;
            this.f61971c = obj2;
            this.f61972d = qVar;
            this.f61973e = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            n0.b(this.f61970b, this.f61971c, this.f61972d, tVar, g3.b(this.f61973e | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: MapEffect.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.maps.android.compose.MapEffectKt$MapEffect$5", f = "MapEffect.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 9, 0})
    static final class e extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f61974b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f61975c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.q<kotlinx.coroutines.r0, GoogleMap, kotlin.coroutines.d<? super k2>, Object> f61976d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ GoogleMap f61977e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(ld.q<? super kotlinx.coroutines.r0, ? super GoogleMap, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar, GoogleMap googleMap, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f61976d = qVar;
            this.f61977e = googleMap;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            e eVar = new e(this.f61976d, this.f61977e, dVar);
            eVar.f61975c = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f61974b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                kotlinx.coroutines.r0 r0Var = (kotlinx.coroutines.r0) this.f61975c;
                ld.q<kotlinx.coroutines.r0, GoogleMap, kotlin.coroutines.d<? super k2>, Object> qVar = this.f61976d;
                GoogleMap googleMap = this.f61977e;
                this.f61974b = 1;
                if (qVar.R(r0Var, googleMap, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("ߔ\u0001"));
                }
                kotlin.a1.n(obj);
            }
            return k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((e) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: MapEffect.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class f extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f61978b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f61979c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f61980d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.q<kotlinx.coroutines.r0, GoogleMap, kotlin.coroutines.d<? super k2>, Object> f61981e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f61982f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(Object obj, Object obj2, Object obj3, ld.q<? super kotlinx.coroutines.r0, ? super GoogleMap, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar, int i4) {
            super(2);
            this.f61978b = obj;
            this.f61979c = obj2;
            this.f61980d = obj3;
            this.f61981e = qVar;
            this.f61982f = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            n0.a(this.f61978b, this.f61979c, this.f61980d, this.f61981e, tVar, g3.b(this.f61982f | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: MapEffect.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.maps.android.compose.MapEffectKt$MapEffect$7", f = "MapEffect.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 9, 0})
    static final class g extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f61983b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f61984c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.q<kotlinx.coroutines.r0, GoogleMap, kotlin.coroutines.d<? super k2>, Object> f61985d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ GoogleMap f61986e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(ld.q<? super kotlinx.coroutines.r0, ? super GoogleMap, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar, GoogleMap googleMap, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.f61985d = qVar;
            this.f61986e = googleMap;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            g gVar = new g(this.f61985d, this.f61986e, dVar);
            gVar.f61984c = obj;
            return gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f61983b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                kotlinx.coroutines.r0 r0Var = (kotlinx.coroutines.r0) this.f61984c;
                ld.q<kotlinx.coroutines.r0, GoogleMap, kotlin.coroutines.d<? super k2>, Object> qVar = this.f61985d;
                GoogleMap googleMap = this.f61986e;
                this.f61983b = 1;
                if (qVar.R(r0Var, googleMap, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("ߕ\u0001"));
                }
                kotlin.a1.n(obj);
            }
            return k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((g) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: MapEffect.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class h extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object[] f61987b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.q<kotlinx.coroutines.r0, GoogleMap, kotlin.coroutines.d<? super k2>, Object> f61988c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f61989d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(Object[] objArr, ld.q<? super kotlinx.coroutines.r0, ? super GoogleMap, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar, int i4) {
            super(2);
            this.f61987b = objArr;
            this.f61988c = qVar;
            this.f61989d = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            Object[] objArr = this.f61987b;
            n0.d(Arrays.copyOf(objArr, objArr.length), this.f61988c, tVar, g3.b(this.f61989d | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    @b1
    @k
    @androidx.compose.runtime.i
    public static final void a(@fg.m Object obj, @fg.m Object obj2, @fg.m Object obj3, @fg.l ld.q<? super kotlinx.coroutines.r0, ? super GoogleMap, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        kotlin.jvm.internal.l0.p(qVar, ProtectedSandApp.s("ߖ\u0001"));
        androidx.compose.runtime.t o4 = tVar.o(-88380218);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-88380218, i4, -1, ProtectedSandApp.s("ߗ\u0001"));
        }
        androidx.compose.runtime.e<?> s4 = o4.s();
        kotlin.jvm.internal.l0.n(s4, ProtectedSandApp.s("ߘ\u0001"));
        androidx.compose.runtime.a1.f(obj, obj2, obj3, new e(qVar, ((b0) s4).getMap(), null), o4, 4680);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new f(obj, obj2, obj3, qVar, i4));
        }
    }

    @b1
    @k
    @androidx.compose.runtime.i
    public static final void b(@fg.m Object obj, @fg.m Object obj2, @fg.l ld.q<? super kotlinx.coroutines.r0, ? super GoogleMap, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        kotlin.jvm.internal.l0.p(qVar, ProtectedSandApp.s("ߖ\u0001"));
        androidx.compose.runtime.t o4 = tVar.o(-834763738);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-834763738, i4, -1, ProtectedSandApp.s("ߙ\u0001"));
        }
        androidx.compose.runtime.e<?> s4 = o4.s();
        kotlin.jvm.internal.l0.n(s4, ProtectedSandApp.s("ߘ\u0001"));
        androidx.compose.runtime.a1.g(obj, obj2, new c(qVar, ((b0) s4).getMap(), null), o4, 584);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new d(obj, obj2, qVar, i4));
        }
    }

    @b1
    @k
    @androidx.compose.runtime.i
    public static final void c(@fg.m Object obj, @fg.l ld.q<? super kotlinx.coroutines.r0, ? super GoogleMap, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        kotlin.jvm.internal.l0.p(qVar, ProtectedSandApp.s("ߖ\u0001"));
        androidx.compose.runtime.t o4 = tVar.o(-357282938);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-357282938, i4, -1, ProtectedSandApp.s("ߚ\u0001"));
        }
        androidx.compose.runtime.e<?> s4 = o4.s();
        kotlin.jvm.internal.l0.n(s4, ProtectedSandApp.s("ߘ\u0001"));
        androidx.compose.runtime.a1.h(obj, new a(qVar, ((b0) s4).getMap(), null), o4, 72);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new b(obj, qVar, i4));
        }
    }

    @b1
    @k
    @androidx.compose.runtime.i
    public static final void d(@fg.l Object[] objArr, @fg.l ld.q<? super kotlinx.coroutines.r0, ? super GoogleMap, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        kotlin.jvm.internal.l0.p(objArr, ProtectedSandApp.s("ߛ\u0001"));
        kotlin.jvm.internal.l0.p(qVar, ProtectedSandApp.s("ߖ\u0001"));
        androidx.compose.runtime.t o4 = tVar.o(-276920653);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-276920653, i4, -1, ProtectedSandApp.s("ߜ\u0001"));
        }
        androidx.compose.runtime.e<?> s4 = o4.s();
        kotlin.jvm.internal.l0.n(s4, ProtectedSandApp.s("ߘ\u0001"));
        androidx.compose.runtime.a1.j(Arrays.copyOf(objArr, objArr.length), new g(qVar, ((b0) s4).getMap(), null), o4, 72);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new h(objArr, qVar, i4));
        }
    }
}
