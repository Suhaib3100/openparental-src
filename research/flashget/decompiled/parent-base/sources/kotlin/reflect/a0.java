package kotlin.reflect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.g0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: TypesJVM.kt */
@kotlin.r
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\nJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\nJ'\u0010\u001f\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u001c*\u00020\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0\r¢\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001b0\r¢\u0006\u0004\b#\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lkotlin/reflect/a0;", "Ljava/lang/reflect/TypeVariable;", "Ljava/lang/reflect/GenericDeclaration;", "Lkotlin/reflect/y;", "Lkotlin/reflect/t;", "typeParameter", "<init>", "(Lkotlin/reflect/t;)V", "", "getName", "()Ljava/lang/String;", "getGenericDeclaration", "()Ljava/lang/reflect/GenericDeclaration;", "", "Ljava/lang/reflect/Type;", "getBounds", "()[Ljava/lang/reflect/Type;", "getTypeName", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "", "T", "Ljava/lang/Class;", "annotationClass", "c", "(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;", "d", "()[Ljava/lang/annotation/Annotation;", "k0", "b", "Lkotlin/reflect/t;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypeVariableImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,230:1\n1549#2:231\n1620#2,3:232\n37#3,2:235\n26#4:237\n26#4:238\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypeVariableImpl\n*L\n116#1:231\n116#1:232,3\n116#1:235,2\n134#1:237\n137#1:238\n*E\n"})
/* loaded from: classes7.dex */
final class a0 implements TypeVariable<GenericDeclaration>, y {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final t typeParameter;

    public a0(@fg.l t tVar) {
        l0.p(tVar, ProtectedSandApp.s("昁\u0001"));
        this.typeParameter = tVar;
    }

    @fg.m
    public final <T extends Annotation> T c(@fg.l Class<T> annotationClass) {
        l0.p(annotationClass, ProtectedSandApp.s("昂\u0001"));
        return null;
    }

    @fg.l
    public final Annotation[] d() {
        return new Annotation[0];
    }

    public boolean equals(@fg.m Object other) {
        if (other instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) other;
            if (l0.g(this.typeParameter.getName(), typeVariable.getName()) && l0.g(getGenericDeclaration(), typeVariable.getGenericDeclaration())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.TypeVariable
    @fg.l
    public Type[] getBounds() {
        Type c5;
        List<s> upperBounds = this.typeParameter.getUpperBounds();
        ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(upperBounds, 10));
        Iterator<T> it = upperBounds.iterator();
        while (it.hasNext()) {
            c5 = b0.c((s) it.next(), true);
            arrayList.add(c5);
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    @fg.l
    public GenericDeclaration getGenericDeclaration() {
        throw new g0(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("昄\u0001"), ProtectedSandApp.s("昃\u0001") + this.typeParameter));
    }

    @Override // java.lang.reflect.TypeVariable
    @fg.l
    public String getName() {
        return this.typeParameter.getName();
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.y
    @fg.l
    public String getTypeName() {
        return this.typeParameter.getName();
    }

    public int hashCode() {
        return this.typeParameter.getName().hashCode() ^ getGenericDeclaration().hashCode();
    }

    @fg.l
    public final Annotation[] k0() {
        return new Annotation[0];
    }

    @fg.l
    public String toString() {
        return this.typeParameter.getName();
    }
}
