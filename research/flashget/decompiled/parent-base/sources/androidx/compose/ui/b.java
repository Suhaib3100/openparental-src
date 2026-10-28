package androidx.compose.ui;

import androidx.compose.ui.node.y0;
import androidx.compose.ui.platform.a2;
import java.lang.reflect.Field;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: Actual.jvm.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0001\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0004\u001a\u001f\u0010\u0002\u001a\u00020\b*\u00020\u00052\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0000¢\u0006\u0004\b\u0002\u0010\t¨\u0006\n"}, d2 = {"", "a", "b", "", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "Landroidx/compose/ui/platform/a2;", "Landroidx/compose/ui/node/y0;", "element", "Lkotlin/k2;", "(Landroidx/compose/ui/platform/a2;Landroidx/compose/ui/node/y0;)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nActual.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Actual.jvm.kt\nandroidx/compose/ui/Actual_jvmKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,50:1\n6442#2:51\n33#3,6:52\n*S KotlinDebug\n*F\n+ 1 Actual.jvm.kt\nandroidx/compose/ui/Actual_jvmKt\n*L\n34#1:51\n35#1:52,6\n*E\n"})
/* loaded from: classes.dex */
public final class b {

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/g$a", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 Actual.jvm.kt\nandroidx/compose/ui/Actual_jvmKt\n*L\n1#1,328:1\n34#2:329\n*E\n"})
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t4, T t5) {
            return kotlin.comparisons.a.l(((Field) t4).getName(), ((Field) t5).getName());
        }
    }

    public static final boolean a(@fg.l Object obj, @fg.l Object obj2) {
        return obj.getClass() == obj2.getClass();
    }

    public static final void b(@fg.l a2 a2Var, @fg.l y0<?> y0Var) {
        List Mv = kotlin.collections.l.Mv(y0Var.getClass().getDeclaredFields(), new a());
        int size = Mv.size();
        for (int i4 = 0; i4 < size; i4++) {
            Field field = (Field) Mv.get(i4);
            if (!field.getDeclaringClass().isAssignableFrom(y0.class)) {
                try {
                    field.setAccessible(true);
                    a2Var.getProperties().c(field.getName(), field.get(y0Var));
                } catch (IllegalAccessException | SecurityException unused) {
                }
            }
        }
    }
}
