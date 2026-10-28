package com.luck.picture.lib.config;

import java.util.LinkedList;

/* loaded from: classes6.dex */
public class SelectorProviders {
    private static volatile SelectorProviders selectorProviders;
    private final LinkedList<SelectorConfig> selectionConfigsQueue = new LinkedList<>();

    public static SelectorProviders getInstance() {
        if (selectorProviders == null) {
            synchronized (SelectorProviders.class) {
                try {
                    if (selectorProviders == null) {
                        selectorProviders = new SelectorProviders();
                    }
                } finally {
                }
            }
        }
        return selectorProviders;
    }

    public void addSelectorConfigQueue(SelectorConfig selectorConfig) {
        this.selectionConfigsQueue.add(selectorConfig);
    }

    public void destroy() {
        SelectorConfig selectorConfig = getSelectorConfig();
        if (selectorConfig != null) {
            selectorConfig.destroy();
            this.selectionConfigsQueue.remove(selectorConfig);
        }
    }

    public SelectorConfig getSelectorConfig() {
        return this.selectionConfigsQueue.size() > 0 ? this.selectionConfigsQueue.getLast() : new SelectorConfig();
    }

    public void reset() {
        for (int i4 = 0; i4 < this.selectionConfigsQueue.size(); i4++) {
            SelectorConfig selectorConfig = this.selectionConfigsQueue.get(i4);
            if (selectorConfig != null) {
                selectorConfig.destroy();
            }
        }
        this.selectionConfigsQueue.clear();
    }
}
