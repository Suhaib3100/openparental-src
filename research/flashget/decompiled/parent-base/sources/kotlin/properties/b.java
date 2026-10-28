package kotlin.properties;

import androidx.compose.foundation.layout.f3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.reflect.o;

/* compiled from: Delegates.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\t\u001a\u00028\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ.\u0010\r\u001a\u00020\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u000b\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0012¨\u0006\u0013"}, d2 = {"Lkotlin/properties/b;", "", "T", "Lkotlin/properties/f;", "<init>", "()V", "thisRef", "Lkotlin/reflect/o;", "property", "a", "(Ljava/lang/Object;Lkotlin/reflect/o;)Ljava/lang/Object;", "value", "Lkotlin/k2;", "b", "(Ljava/lang/Object;Lkotlin/reflect/o;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class b<T> implements f<Object, T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @m
    private T value;

    @Override // kotlin.properties.f, kotlin.properties.e
    @l
    public T a(@m Object thisRef, @l o<?> property) {
        l0.p(property, ProtectedSandApp.s("斏\u0001"));
        T t4 = this.value;
        if (t4 != null) {
            return t4;
        }
        throw new IllegalStateException(ProtectedSandApp.s("斐\u0001") + property.getName() + ProtectedSandApp.s("斑\u0001"));
    }

    @Override // kotlin.properties.f
    public void b(@m Object thisRef, @l o<?> property, @l T value) {
        l0.p(property, ProtectedSandApp.s("斏\u0001"));
        l0.p(value, ProtectedSandApp.s("斒\u0001"));
        this.value = value;
    }

    @l
    public String toString() {
        String s4;
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("斓\u0001"));
        if (this.value != null) {
            s4 = ProtectedSandApp.s("斔\u0001") + this.value;
        } else {
            s4 = ProtectedSandApp.s("斕\u0001");
        }
        return f3.a(sb, s4, ')');
    }
}
