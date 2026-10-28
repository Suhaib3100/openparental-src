package androidx.compose.ui.modifier;

import androidx.compose.runtime.b5;
import androidx.compose.runtime.o4;
import androidx.compose.ui.platform.a2;
import androidx.compose.ui.platform.b2;
import androidx.compose.ui.platform.y1;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: ModifierLocalProvider.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\u0006\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "Landroidx/compose/ui/q;", "Landroidx/compose/ui/modifier/p;", "key", "Lkotlin/Function0;", "value", "a", "(Landroidx/compose/ui/q;Landroidx/compose/ui/modifier/p;Lld/a;)Landroidx/compose/ui/q;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nModifierLocalProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalProvider.kt\nandroidx/compose/ui/modifier/ModifierLocalProviderKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,70:1\n135#2:71\n*S KotlinDebug\n*F\n+ 1 ModifierLocalProvider.kt\nandroidx/compose/ui/modifier/ModifierLocalProviderKt\n*L\n59#1:71\n*E\n"})
/* loaded from: classes.dex */
public final class m {

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 ModifierLocalProvider.kt\nandroidx/compose/ui/modifier/ModifierLocalProviderKt\n*L\n1#1,170:1\n60#2,4:171\n*E\n"})
    public static final class a extends n0 implements ld.l<a2, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f19142b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.a f19143c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p pVar, ld.a aVar) {
            super(1);
            this.f19142b = pVar;
            this.f19143c = aVar;
        }

        public final void a(@fg.l a2 a2Var) {
            a2Var.d("modifierLocalProvider");
            a2Var.getProperties().c("key", this.f19142b);
            a2Var.getProperties().c("value", this.f19143c);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(a2 a2Var) {
            a(a2Var);
            return k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ModifierLocalProvider.kt */
    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0002R \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00028\u00008VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"androidx/compose/ui/modifier/m$b", "Landroidx/compose/ui/modifier/l;", "Landroidx/compose/ui/platform/b2;", "Landroidx/compose/ui/modifier/p;", "e", "Landroidx/compose/ui/modifier/p;", "getKey", "()Landroidx/compose/ui/modifier/p;", "key", "f", "Landroidx/compose/runtime/b5;", "getValue", "()Ljava/lang/Object;", "value", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nModifierLocalProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalProvider.kt\nandroidx/compose/ui/modifier/ModifierLocalProviderKt$modifierLocalProvider$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,70:1\n81#2:71\n*S KotlinDebug\n*F\n+ 1 ModifierLocalProvider.kt\nandroidx/compose/ui/modifier/ModifierLocalProviderKt$modifierLocalProvider$1\n*L\n66#1:71\n*E\n"})
    public static final class b<T> extends b2 implements l<T> {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final p<T> key;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final b5 value;

        b(p<T> pVar, ld.a<? extends T> aVar, ld.l<? super a2, k2> lVar) {
            super(lVar);
            this.key = pVar;
            this.value = o4.e(aVar);
        }

        @Override // androidx.compose.ui.modifier.l
        @fg.l
        public p<T> getKey() {
            return this.key;
        }

        @Override // androidx.compose.ui.modifier.l
        public T getValue() {
            return (T) this.value.getValue();
        }
    }

    @fg.l
    @androidx.compose.ui.k
    public static final <T> androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, @fg.l p<T> pVar, @fg.l ld.a<? extends T> aVar) {
        return qVar.w3(new b(pVar, aVar, y1.e() ? new a(pVar, aVar) : y1.b()));
    }
}
