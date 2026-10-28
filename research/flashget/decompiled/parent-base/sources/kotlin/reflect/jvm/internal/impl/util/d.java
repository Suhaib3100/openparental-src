package kotlin.reflect.jvm.internal.impl.util;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;

/* compiled from: ArrayMap.kt */
@r1({"SMAP\nArrayMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayMap.kt\norg/jetbrains/kotlin/util/ArrayMapImpl\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,145:1\n11245#2,11:146\n13374#2,2:157\n13376#2:160\n11256#2:161\n1#3:159\n*S KotlinDebug\n*F\n+ 1 ArrayMap.kt\norg/jetbrains/kotlin/util/ArrayMapImpl\n*L\n140#1:146,11\n140#1:157,2\n140#1:160\n140#1:161\n140#1:159\n*E\n"})
/* loaded from: classes7.dex */
public final class d<T> extends c<T> {

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    public static final a f78583d = new a();

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private Object[] f78584b;

    /* renamed from: c, reason: collision with root package name */
    private int f78585c;

    /* compiled from: ArrayMap.kt */
    public static final class a {
        private a() {
        }

        public a(w wVar) {
        }
    }

    /* compiled from: ArrayMap.kt */
    public static final class b extends kotlin.collections.b<T> {

        /* renamed from: d, reason: collision with root package name */
        private int f78586d = -1;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ d<T> f78587e;

        b(d<T> dVar) {
            this.f78587e = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.collections.b
        protected void b() {
            do {
                int i4 = this.f78586d + 1;
                this.f78586d = i4;
                if (i4 >= ((d) this.f78587e).f78584b.length) {
                    break;
                }
            } while (((d) this.f78587e).f78584b[this.f78586d] == null);
            if (this.f78586d >= ((d) this.f78587e).f78584b.length) {
                c();
                return;
            }
            Object obj = ((d) this.f78587e).f78584b[this.f78586d];
            l0.n(obj, ProtectedSandApp.s("肶\u0001"));
            d(obj);
        }
    }

    private d(Object[] objArr, int i4) {
        super(null);
        this.f78584b = objArr;
        this.f78585c = i4;
    }

    private final void h(int i4) {
        Object[] objArr = this.f78584b;
        if (objArr.length > i4) {
            return;
        }
        int length = objArr.length;
        do {
            length *= 2;
        } while (length <= i4);
        Object[] copyOf = Arrays.copyOf(this.f78584b, length);
        l0.o(copyOf, ProtectedSandApp.s("肷\u0001"));
        this.f78584b = copyOf;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    public int b() {
        return this.f78585c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    public void c(int i4, @fg.l T t4) {
        l0.p(t4, ProtectedSandApp.s("肸\u0001"));
        h(i4);
        Object[] objArr = this.f78584b;
        if (objArr[i4] == null) {
            this.f78585c++;
        }
        objArr[i4] = t4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    @fg.m
    public T get(int i4) {
        return (T) kotlin.collections.l.Pe(this.f78584b, i4);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c, java.lang.Iterable
    @fg.l
    public Iterator<T> iterator() {
        return new b(this);
    }

    public d() {
        this(new Object[20], 0);
    }
}
