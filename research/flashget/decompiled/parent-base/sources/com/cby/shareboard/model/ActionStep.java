package com.cby.shareboard.model;

import fg.l;
import kotlin.Metadata;

/* compiled from: ActionStep.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/cby/shareboard/model/ActionStep;", "", "()V", "CLEAR_ACK", "", "CLEAR_SELF", "END", "IMAGE", "MOVE", "NEXT", "PREVIOUS", "REDO", "REVOKE", "SCALE", "START", "TRANSLATE", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ActionStep {
    public static final byte CLEAR_ACK = 7;
    public static final byte CLEAR_SELF = 6;
    public static final byte END = 3;
    public static final byte IMAGE = 12;

    @l
    public static final ActionStep INSTANCE = new ActionStep();
    public static final byte MOVE = 2;
    public static final byte NEXT = 11;
    public static final byte PREVIOUS = 10;
    public static final byte REDO = 5;
    public static final byte REVOKE = 4;
    public static final byte SCALE = 9;
    public static final byte START = 1;
    public static final byte TRANSLATE = 8;

    private ActionStep() {
    }
}
