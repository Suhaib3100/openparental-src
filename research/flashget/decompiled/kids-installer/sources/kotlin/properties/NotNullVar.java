package kotlin.properties;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.reflect.KProperty;

/* compiled from: Delegates.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004J$\u0010\u0007\u001a\u00028\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u00022\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0096\u0002¢\u0006\u0002\u0010\u000bJ,\u0010\f\u001a\u00020\r2\b\u0010\b\u001a\u0004\u0018\u00010\u00022\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0012\u0010\u0005\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\u0011"}, d2 = {"Lkotlin/properties/NotNullVar;", "T", "", "Lkotlin/properties/ReadWriteProperty;", "()V", "value", "Ljava/lang/Object;", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "setValue", "", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.properties.b, reason: from Kotlin metadata */
/* loaded from: classes6.dex */
final class NotNullVar<T> implements ReadWriteProperty<Object, T> {

    /* renamed from: a, reason: collision with root package name */
    @d5.e
    private T f23677a;

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    @d5.d
    public T a(@d5.e Object obj, @d5.d KProperty<?> kProperty) {
        l0.p(kProperty, ProtectedSandApp.s("罠"));
        T t5 = this.f23677a;
        if (t5 != null) {
            return t5;
        }
        throw new IllegalStateException(ProtectedSandApp.s("罡") + kProperty.getName() + ProtectedSandApp.s("罢"));
    }

    @Override // kotlin.properties.ReadWriteProperty
    public void b(@d5.e Object obj, @d5.d KProperty<?> kProperty, @d5.d T t5) {
        l0.p(kProperty, ProtectedSandApp.s("罣"));
        l0.p(t5, ProtectedSandApp.s("罤"));
        this.f23677a = t5;
    }

    @d5.d
    public String toString() {
        String s5;
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("罥"));
        if (this.f23677a != null) {
            s5 = ProtectedSandApp.s("罦") + this.f23677a;
        } else {
            s5 = ProtectedSandApp.s("罧");
        }
        return c1.c.a(sb, s5, ')');
    }
}
