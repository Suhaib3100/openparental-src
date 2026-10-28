package kotlin.properties;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.reflect.o;
import ld.q;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: Delegates.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0004*\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0082\u0001\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00042\u0006\u0010\b\u001a\u00028\u00002Q\b\u0004\u0010\u0011\u001aK\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0082\u0001\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00042\u0006\u0010\b\u001a\u00028\u00002Q\b\u0004\u0010\u0011\u001aK\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00140\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"Lkotlin/properties/a;", "", "<init>", "()V", "T", "Lkotlin/properties/f;", "a", "()Lkotlin/properties/f;", "initialValue", "Lkotlin/Function3;", "Lkotlin/reflect/o;", "Lkotlin/r0;", "name", "property", "oldValue", "newValue", "Lkotlin/k2;", "onChange", "b", "(Ljava/lang/Object;Lld/q;)Lkotlin/properties/f;", "", "c", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final a f75425a = new a();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Delegates.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"kotlin/properties/a$a", "Lkotlin/properties/c;", "Lkotlin/reflect/o;", "property", "oldValue", "newValue", "Lkotlin/k2;", "c", "(Lkotlin/reflect/o;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$observable$1\n*L\n1#1,73:1\n*E\n"})
    /* renamed from: kotlin.properties.a$a, reason: collision with other inner class name */
    public static final class C1062a<T> extends c<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q<o<?>, T, T, k2> f75426b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C1062a(T t4, q<? super o<?>, ? super T, ? super T, k2> qVar) {
            super(t4);
            this.f75426b = qVar;
        }

        @Override // kotlin.properties.c
        protected void c(@l o<?> property, T oldValue, T newValue) {
            l0.p(property, ProtectedSandApp.s("斌\u0001"));
            this.f75426b.R(property, oldValue, newValue);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Delegates.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"kotlin/properties/a$b", "Lkotlin/properties/c;", "Lkotlin/reflect/o;", "property", "oldValue", "newValue", "", "d", "(Lkotlin/reflect/o;Ljava/lang/Object;Ljava/lang/Object;)Z", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$vetoable$1\n*L\n1#1,73:1\n*E\n"})
    public static final class b<T> extends c<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q<o<?>, T, T, Boolean> f75427b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(T t4, q<? super o<?>, ? super T, ? super T, Boolean> qVar) {
            super(t4);
            this.f75427b = qVar;
        }

        @Override // kotlin.properties.c
        protected boolean d(@l o<?> property, T oldValue, T newValue) {
            l0.p(property, ProtectedSandApp.s("斍\u0001"));
            return this.f75427b.R(property, oldValue, newValue).booleanValue();
        }
    }

    private a() {
    }

    @l
    public final <T> f<Object, T> a() {
        return new kotlin.properties.b();
    }

    @l
    public final <T> f<Object, T> b(T initialValue, @l q<? super o<?>, ? super T, ? super T, k2> onChange) {
        l0.p(onChange, ProtectedSandApp.s("斎\u0001"));
        return new C1062a(initialValue, onChange);
    }

    @l
    public final <T> f<Object, T> c(T initialValue, @l q<? super o<?>, ? super T, ? super T, Boolean> onChange) {
        l0.p(onChange, ProtectedSandApp.s("斎\u0001"));
        return new b(initialValue, onChange);
    }
}
