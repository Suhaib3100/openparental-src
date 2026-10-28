package com.cby.shareboard.action;

/* loaded from: classes3.dex */
public enum ActionType {
    UnKnow(0),
    Point(1),
    Path(2),
    SmoothPath(3),
    Image(4),
    Line(5),
    Rect(6),
    Circle(7),
    FilledRect(8),
    FilledCircle(9),
    Eraser(10);

    private int value;

    ActionType(int i4) {
        this.value = i4;
    }

    public static ActionType typeOfValue(int i4) {
        for (ActionType actionType : values()) {
            if (actionType.getValue() == i4) {
                return actionType;
            }
        }
        return UnKnow;
    }

    public int getValue() {
        return this.value;
    }
}
