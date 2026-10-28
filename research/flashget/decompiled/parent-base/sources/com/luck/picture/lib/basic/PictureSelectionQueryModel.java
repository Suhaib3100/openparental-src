package com.luck.picture.lib.basic;

import android.app.Activity;
import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.luck.picture.lib.config.SelectorConfig;
import com.luck.picture.lib.config.SelectorProviders;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.entity.LocalMediaFolder;
import com.luck.picture.lib.interfaces.OnQueryAllAlbumListener;
import com.luck.picture.lib.interfaces.OnQueryDataResultListener;
import com.luck.picture.lib.interfaces.OnQueryDataSourceListener;
import com.luck.picture.lib.interfaces.OnQueryFilterListener;
import com.luck.picture.lib.loader.IBridgeMediaLoader;
import com.luck.picture.lib.loader.LocalMediaLoader;
import com.luck.picture.lib.loader.LocalMediaPageLoader;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class PictureSelectionQueryModel {
    private final SelectorConfig selectionConfig;
    private final PictureSelector selector;

    public PictureSelectionQueryModel(PictureSelector pictureSelector, int i4) {
        this.selector = pictureSelector;
        SelectorConfig selectorConfig = new SelectorConfig();
        this.selectionConfig = selectorConfig;
        SelectorProviders.getInstance().addSelectorConfigQueue(selectorConfig);
        selectorConfig.chooseMode = i4;
    }

    public IBridgeMediaLoader buildMediaLoader() {
        Activity activity = this.selector.getActivity();
        if (activity != null) {
            return this.selectionConfig.isPageStrategy ? new LocalMediaPageLoader(activity, this.selectionConfig) : new LocalMediaLoader(activity, this.selectionConfig);
        }
        throw new NullPointerException(ProtectedSandApp.s("ᗤ\u0001"));
    }

    public PictureSelectionQueryModel isBmp(boolean z4) {
        this.selectionConfig.isBmp = z4;
        return this;
    }

    public PictureSelectionQueryModel isGif(boolean z4) {
        this.selectionConfig.isGif = z4;
        return this;
    }

    public PictureSelectionQueryModel isHeic(boolean z4) {
        this.selectionConfig.isHeic = z4;
        return this;
    }

    public PictureSelectionQueryModel isPageStrategy(boolean z4) {
        this.selectionConfig.isPageStrategy = z4;
        return this;
    }

    public PictureSelectionQueryModel isWebp(boolean z4) {
        this.selectionConfig.isWebp = z4;
        return this;
    }

    public void obtainAlbumData(final OnQueryDataSourceListener<LocalMediaFolder> onQueryDataSourceListener) {
        Activity activity = this.selector.getActivity();
        if (activity == null) {
            throw new NullPointerException(ProtectedSandApp.s("ᗤ\u0001"));
        }
        if (onQueryDataSourceListener == null) {
            throw new NullPointerException(ProtectedSandApp.s("ᗥ\u0001"));
        }
        (this.selectionConfig.isPageStrategy ? new LocalMediaPageLoader(activity, this.selectionConfig) : new LocalMediaLoader(activity, this.selectionConfig)).loadAllAlbum(new OnQueryAllAlbumListener<LocalMediaFolder>() { // from class: com.luck.picture.lib.basic.PictureSelectionQueryModel.1
            @Override // com.luck.picture.lib.interfaces.OnQueryAllAlbumListener
            public void onComplete(List<LocalMediaFolder> list) {
                onQueryDataSourceListener.onComplete(list);
            }
        });
    }

    public void obtainMediaData(final OnQueryDataSourceListener<LocalMedia> onQueryDataSourceListener) {
        Activity activity = this.selector.getActivity();
        if (activity == null) {
            throw new NullPointerException(ProtectedSandApp.s("ᗤ\u0001"));
        }
        if (onQueryDataSourceListener == null) {
            throw new NullPointerException(ProtectedSandApp.s("ᗥ\u0001"));
        }
        final IBridgeMediaLoader localMediaPageLoader = this.selectionConfig.isPageStrategy ? new LocalMediaPageLoader(activity, this.selectionConfig) : new LocalMediaLoader(activity, this.selectionConfig);
        localMediaPageLoader.loadAllAlbum(new OnQueryAllAlbumListener<LocalMediaFolder>() { // from class: com.luck.picture.lib.basic.PictureSelectionQueryModel.2
            @Override // com.luck.picture.lib.interfaces.OnQueryAllAlbumListener
            public void onComplete(List<LocalMediaFolder> list) {
                if (list == null || list.size() <= 0) {
                    return;
                }
                LocalMediaFolder localMediaFolder = list.get(0);
                if (PictureSelectionQueryModel.this.selectionConfig.isPageStrategy) {
                    localMediaPageLoader.loadPageMediaData(localMediaFolder.getBucketId(), 1, PictureSelectionQueryModel.this.selectionConfig.pageSize, new OnQueryDataResultListener<LocalMedia>() { // from class: com.luck.picture.lib.basic.PictureSelectionQueryModel.2.1
                        @Override // com.luck.picture.lib.interfaces.OnQueryDataResultListener
                        public void onComplete(ArrayList<LocalMedia> arrayList, boolean z4) {
                            onQueryDataSourceListener.onComplete(arrayList);
                        }
                    });
                } else {
                    onQueryDataSourceListener.onComplete(localMediaFolder.getData());
                }
            }
        });
    }

    public PictureSelectionQueryModel setFilterMaxFileSize(long j4) {
        if (j4 >= 1048576) {
            this.selectionConfig.filterMaxFileSize = j4;
        } else {
            this.selectionConfig.filterMaxFileSize = j4 * 1024;
        }
        return this;
    }

    public PictureSelectionQueryModel setFilterMinFileSize(long j4) {
        if (j4 >= 1048576) {
            this.selectionConfig.filterMinFileSize = j4;
        } else {
            this.selectionConfig.filterMinFileSize = j4 * 1024;
        }
        return this;
    }

    public PictureSelectionQueryModel setFilterVideoMaxSecond(int i4) {
        this.selectionConfig.filterVideoMaxSecond = i4 * 1000;
        return this;
    }

    public PictureSelectionQueryModel setFilterVideoMinSecond(int i4) {
        this.selectionConfig.filterVideoMinSecond = i4 * 1000;
        return this;
    }

    public PictureSelectionQueryModel setQueryFilterListener(OnQueryFilterListener onQueryFilterListener) {
        this.selectionConfig.onQueryFilterListener = onQueryFilterListener;
        return this;
    }

    public PictureSelectionQueryModel setQuerySortOrder(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.selectionConfig.sortOrder = str;
        }
        return this;
    }

    public PictureSelectionQueryModel isPageStrategy(boolean z4, int i4) {
        SelectorConfig selectorConfig = this.selectionConfig;
        selectorConfig.isPageStrategy = z4;
        if (i4 < 10) {
            i4 = 60;
        }
        selectorConfig.pageSize = i4;
        return this;
    }

    public PictureSelectionQueryModel isPageStrategy(boolean z4, int i4, boolean z5) {
        SelectorConfig selectorConfig = this.selectionConfig;
        selectorConfig.isPageStrategy = z4;
        if (i4 < 10) {
            i4 = 60;
        }
        selectorConfig.pageSize = i4;
        selectorConfig.isFilterInvalidFile = z5;
        return this;
    }
}
