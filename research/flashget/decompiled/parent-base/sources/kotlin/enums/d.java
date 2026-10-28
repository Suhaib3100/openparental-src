package kotlin.enums;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.io.Serializable;
import java.lang.Enum;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.jvm.internal.l0;

/* compiled from: EnumEntries.kt */
@c1(version = "1.8")
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0003\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u0006B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0017R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lkotlin/enums/d;", "", "T", "Lkotlin/enums/a;", "Lkotlin/collections/c;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "entries", "<init>", "([Ljava/lang/Enum;)V", "", "j", "()Ljava/lang/Object;", "", "index", "f", "(I)Ljava/lang/Enum;", "element", "", "c", "(Ljava/lang/Enum;)Z", "h", "(Ljava/lang/Enum;)I", "i", "d", "[Ljava/lang/Enum;", "b", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class d<T extends Enum<T>> extends kotlin.collections.c<T> implements a<T>, Serializable {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final T[] entries;

    public d(@l T[] tArr) {
        l0.p(tArr, ProtectedSandApp.s("捐\u0001"));
        this.entries = tArr;
    }

    private final Object j() {
        return new e(this.entries);
    }

    @Override // kotlin.collections.c, kotlin.collections.a
    /* renamed from: b */
    public int getSize() {
        return this.entries.length;
    }

    public boolean c(@l T element) {
        l0.p(element, ProtectedSandApp.s("捑\u0001"));
        return ((Enum) kotlin.collections.l.Pe(this.entries, element.ordinal())) == element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return c((Enum) obj);
        }
        return false;
    }

    @Override // kotlin.collections.c, java.util.List
    @l
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public T get(int index) {
        kotlin.collections.c.INSTANCE.b(index, this.entries.length);
        return this.entries[index];
    }

    public int h(@l T element) {
        l0.p(element, ProtectedSandApp.s("捑\u0001"));
        int ordinal = element.ordinal();
        if (((Enum) kotlin.collections.l.Pe(this.entries, ordinal)) == element) {
            return ordinal;
        }
        return -1;
    }

    public int i(@l T element) {
        l0.p(element, ProtectedSandApp.s("捑\u0001"));
        return indexOf(element);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return h((Enum) obj);
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return i((Enum) obj);
        }
        return -1;
    }
}
