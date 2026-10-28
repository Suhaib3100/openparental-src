package com.google.firebase.sessions;

import kotlin.Metadata;

/* compiled from: SessionEvent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/google/firebase/sessions/j;", "", "Lcom/google/firebase/encoders/json/g;", "", "number", "I", "getNumber", "()I", "<init>", "(Ljava/lang/String;II)V", "EVENT_TYPE_UNKNOWN", "SESSION_START", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public enum j implements com.google.firebase.encoders.json.g {
    EVENT_TYPE_UNKNOWN(0),
    SESSION_START(1);

    private final int number;

    j(int i5) {
        this.number = i5;
    }

    @Override // com.google.firebase.encoders.json.g
    public int getNumber() {
        return this.number;
    }
}
