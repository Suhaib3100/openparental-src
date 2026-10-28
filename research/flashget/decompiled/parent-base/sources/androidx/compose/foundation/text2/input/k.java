package androidx.compose.foundation.text2.input;

import kotlin.Metadata;

/* compiled from: CodepointTransformation.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\f¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/text2/input/k;", "Landroidx/compose/foundation/text2/input/c;", "", "character", "<init>", "(C)V", "", "codepointIndex", "codepoint", "a", "(II)I", "b", "()C", "c", "(C)Landroidx/compose/foundation/text2/input/k;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "C", "e", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class k implements c {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final char character;

    public k(char c5) {
        this.character = c5;
    }

    public static k d(k kVar, char c5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            c5 = kVar.character;
        }
        kVar.getClass();
        return new k(c5);
    }

    @Override // androidx.compose.foundation.text2.input.c
    public int a(int codepointIndex, int codepoint) {
        return this.character;
    }

    /* renamed from: b, reason: from getter */
    public final char getCharacter() {
        return this.character;
    }

    @fg.l
    public final k c(char character) {
        return new k(character);
    }

    public final char e() {
        return this.character;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof k) && this.character == ((k) other).character;
    }

    public int hashCode() {
        return Character.hashCode(this.character);
    }

    @fg.l
    public String toString() {
        return "MaskCodepointTransformation(character=" + this.character + ')';
    }
}
