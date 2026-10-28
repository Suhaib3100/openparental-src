package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.d;

/* compiled from: MemberScope.kt */
/* loaded from: classes7.dex */
public abstract class c {

    /* compiled from: MemberScope.kt */
    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        public static final a f77958a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final int f77959b;

        static {
            d.a aVar = d.f77961c;
            aVar.getClass();
            int i4 = d.f77969k;
            aVar.getClass();
            int i5 = d.f77967i;
            aVar.getClass();
            f77959b = (~(d.f77968j | i5)) & i4;
        }

        private a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.c
        public int a() {
            return f77959b;
        }
    }

    /* compiled from: MemberScope.kt */
    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        public static final b f77960a = new b();

        private b() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.c
        public int a() {
            return 0;
        }
    }

    public abstract int a();

    public String toString() {
        return getClass().getSimpleName();
    }
}
