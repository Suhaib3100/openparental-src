package com.luck.picture.lib;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.d;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.luck.picture.lib.adapter.PictureImageGridAdapter;
import com.luck.picture.lib.animators.AlphaInAnimationAdapter;
import com.luck.picture.lib.animators.SlideInBottomAnimationAdapter;
import com.luck.picture.lib.basic.IBridgeLoaderFactory;
import com.luck.picture.lib.basic.IPictureSelectorEvent;
import com.luck.picture.lib.basic.PictureCommonFragment;
import com.luck.picture.lib.config.InjectResourceSource;
import com.luck.picture.lib.config.PictureMimeType;
import com.luck.picture.lib.config.SelectMimeType;
import com.luck.picture.lib.config.SelectorConfig;
import com.luck.picture.lib.decoration.GridSpacingItemDecoration;
import com.luck.picture.lib.dialog.AlbumListPopWindow;
import com.luck.picture.lib.engine.ExtendLoaderEngine;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.entity.LocalMediaFolder;
import com.luck.picture.lib.interfaces.OnAlbumItemClickListener;
import com.luck.picture.lib.interfaces.OnPermissionsInterceptListener;
import com.luck.picture.lib.interfaces.OnQueryAlbumListener;
import com.luck.picture.lib.interfaces.OnQueryAllAlbumListener;
import com.luck.picture.lib.interfaces.OnQueryDataResultListener;
import com.luck.picture.lib.interfaces.OnRecyclerViewPreloadMoreListener;
import com.luck.picture.lib.interfaces.OnRecyclerViewScrollListener;
import com.luck.picture.lib.interfaces.OnRecyclerViewScrollStateListener;
import com.luck.picture.lib.interfaces.OnRequestPermissionListener;
import com.luck.picture.lib.loader.IBridgeMediaLoader;
import com.luck.picture.lib.loader.LocalMediaLoader;
import com.luck.picture.lib.loader.LocalMediaPageLoader;
import com.luck.picture.lib.permissions.PermissionChecker;
import com.luck.picture.lib.permissions.PermissionConfig;
import com.luck.picture.lib.permissions.PermissionResultCallback;
import com.luck.picture.lib.style.SelectMainStyle;
import com.luck.picture.lib.utils.ActivityCompatHelper;
import com.luck.picture.lib.utils.AnimUtils;
import com.luck.picture.lib.utils.DateUtils;
import com.luck.picture.lib.utils.DensityUtil;
import com.luck.picture.lib.utils.DoubleUtils;
import com.luck.picture.lib.utils.StyleUtils;
import com.luck.picture.lib.utils.ToastUtils;
import com.luck.picture.lib.utils.ValueOf;
import com.luck.picture.lib.widget.BottomNavBar;
import com.luck.picture.lib.widget.CompleteSelectView;
import com.luck.picture.lib.widget.RecyclerPreloadView;
import com.luck.picture.lib.widget.SlideSelectTouchListener;
import com.luck.picture.lib.widget.SlideSelectionHandler;
import com.luck.picture.lib.widget.TitleBar;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public class PictureSelectorFragment extends PictureCommonFragment implements OnRecyclerViewPreloadMoreListener, IPictureSelectorEvent {
    private static int SELECT_ANIM_DURATION = 135;
    private AlbumListPopWindow albumListPopWindow;
    private int allFolderSize;
    private BottomNavBar bottomNarBar;
    private CompleteSelectView completeSelectView;
    private boolean isCameraCallback;
    private boolean isDisplayCamera;
    private boolean isMemoryRecycling;
    private PictureImageGridAdapter mAdapter;
    private SlideSelectTouchListener mDragSelectTouchListener;
    private RecyclerPreloadView mRecycler;
    private TitleBar titleBar;
    private TextView tvCurrentDataTime;
    private TextView tvDataEmpty;
    public static final String TAG = ProtectedSandApp.s("ᖙ\u0001");
    private static final Object LOCK = new Object();
    private long intervalClickTime = 0;
    private int currentPosition = -1;

    private void addAlbumPopWindowAction() {
        this.albumListPopWindow.setOnIBridgeAlbumWidget(new OnAlbumItemClickListener() { // from class: com.luck.picture.lib.PictureSelectorFragment.7
            @Override // com.luck.picture.lib.interfaces.OnAlbumItemClickListener
            public void onItemClick(int i4, LocalMediaFolder localMediaFolder) {
                PictureSelectorFragment pictureSelectorFragment = PictureSelectorFragment.this;
                pictureSelectorFragment.isDisplayCamera = ((PictureCommonFragment) pictureSelectorFragment).selectorConfig.isDisplayCamera && localMediaFolder.getBucketId() == -1;
                PictureSelectorFragment.this.mAdapter.setDisplayCamera(PictureSelectorFragment.this.isDisplayCamera);
                PictureSelectorFragment.this.titleBar.setTitle(localMediaFolder.getFolderName());
                LocalMediaFolder localMediaFolder2 = ((PictureCommonFragment) PictureSelectorFragment.this).selectorConfig.currentLocalMediaFolder;
                long bucketId = localMediaFolder2.getBucketId();
                if (((PictureCommonFragment) PictureSelectorFragment.this).selectorConfig.isPageStrategy) {
                    if (localMediaFolder.getBucketId() != bucketId) {
                        localMediaFolder2.setData(PictureSelectorFragment.this.mAdapter.getData());
                        localMediaFolder2.setCurrentDataPage(((PictureCommonFragment) PictureSelectorFragment.this).mPage);
                        localMediaFolder2.setHasMore(PictureSelectorFragment.this.mRecycler.isEnabledLoadMore());
                        if (localMediaFolder.getData().size() <= 0 || localMediaFolder.isHasMore()) {
                            ((PictureCommonFragment) PictureSelectorFragment.this).mPage = 1;
                            if (((PictureCommonFragment) PictureSelectorFragment.this).selectorConfig.loaderDataEngine != null) {
                                ((PictureCommonFragment) PictureSelectorFragment.this).selectorConfig.loaderDataEngine.loadFirstPageMediaData(PictureSelectorFragment.this.getContext(), localMediaFolder.getBucketId(), ((PictureCommonFragment) PictureSelectorFragment.this).mPage, ((PictureCommonFragment) PictureSelectorFragment.this).selectorConfig.pageSize, new OnQueryDataResultListener<LocalMedia>() { // from class: com.luck.picture.lib.PictureSelectorFragment.7.1
                                    @Override // com.luck.picture.lib.interfaces.OnQueryDataResultListener
                                    public void onComplete(ArrayList<LocalMedia> arrayList, boolean z4) {
                                        PictureSelectorFragment.this.handleSwitchAlbum(arrayList, z4);
                                    }
                                });
                            } else {
                                ((PictureCommonFragment) PictureSelectorFragment.this).mLoader.loadPageMediaData(localMediaFolder.getBucketId(), ((PictureCommonFragment) PictureSelectorFragment.this).mPage, ((PictureCommonFragment) PictureSelectorFragment.this).selectorConfig.pageSize, new OnQueryDataResultListener<LocalMedia>() { // from class: com.luck.picture.lib.PictureSelectorFragment.7.2
                                    @Override // com.luck.picture.lib.interfaces.OnQueryDataResultListener
                                    public void onComplete(ArrayList<LocalMedia> arrayList, boolean z4) {
                                        PictureSelectorFragment.this.handleSwitchAlbum(arrayList, z4);
                                    }
                                });
                            }
                        } else {
                            PictureSelectorFragment.this.setAdapterData(localMediaFolder.getData());
                            ((PictureCommonFragment) PictureSelectorFragment.this).mPage = localMediaFolder.getCurrentDataPage();
                            PictureSelectorFragment.this.mRecycler.setEnabledLoadMore(localMediaFolder.isHasMore());
                            PictureSelectorFragment.this.mRecycler.smoothScrollToPosition(0);
                        }
                    }
                } else if (localMediaFolder.getBucketId() != bucketId) {
                    PictureSelectorFragment.this.setAdapterData(localMediaFolder.getData());
                    PictureSelectorFragment.this.mRecycler.smoothScrollToPosition(0);
                }
                ((PictureCommonFragment) PictureSelectorFragment.this).selectorConfig.currentLocalMediaFolder = localMediaFolder;
                PictureSelectorFragment.this.albumListPopWindow.dismiss();
                if (PictureSelectorFragment.this.mDragSelectTouchListener == null || !((PictureCommonFragment) PictureSelectorFragment.this).selectorConfig.isFastSlidingSelect) {
                    return;
                }
                PictureSelectorFragment.this.mDragSelectTouchListener.setRecyclerViewHeaderCount(PictureSelectorFragment.this.mAdapter.isDisplayCamera() ? 1 : 0);
            }
        });
    }

    private void addRecyclerAction() {
        this.mAdapter.setOnItemClickListener(new PictureImageGridAdapter.OnItemClickListener() { // from class: com.luck.picture.lib.PictureSelectorFragment.16
            @Override // com.luck.picture.lib.adapter.PictureImageGridAdapter.OnItemClickListener
            public void onItemClick(View view, int i4, LocalMedia localMedia) {
                if (((PictureCommonFragment) PictureSelectorFragment.this).selectorConfig.selectionMode != 1 || !((PictureCommonFragment) PictureSelectorFragment.this).selectorConfig.isDirectReturnSingle) {
                    if (DoubleUtils.isFastDoubleClick()) {
                        return;
                    }
                    PictureSelectorFragment.this.onStartPreview(i4, false);
                } else {
                    ((PictureCommonFragment) PictureSelectorFragment.this).selectorConfig.selectedResult.clear();
                    if (PictureSelectorFragment.this.confirmSelect(localMedia, false) == 0) {
                        PictureSelectorFragment.this.dispatchTransformResult();
                    }
                }
            }

            @Override // com.luck.picture.lib.adapter.PictureImageGridAdapter.OnItemClickListener
            public void onItemLongClick(View view, int i4) {
                if (PictureSelectorFragment.this.mDragSelectTouchListener == null || !((PictureCommonFragment) PictureSelectorFragment.this).selectorConfig.isFastSlidingSelect) {
                    return;
                }
                ((Vibrator) PictureSelectorFragment.this.getActivity().getSystemService(ProtectedSandApp.s("ᖘ\u0001"))).vibrate(50L);
                PictureSelectorFragment.this.mDragSelectTouchListener.startSlideSelection(i4);
            }

            @Override // com.luck.picture.lib.adapter.PictureImageGridAdapter.OnItemClickListener
            public int onSelected(View view, int i4, LocalMedia localMedia) {
                int confirmSelect = PictureSelectorFragment.this.confirmSelect(localMedia, view.isSelected());
                if (confirmSelect == 0) {
                    if (((PictureCommonFragment) PictureSelectorFragment.this).selectorConfig.onSelectAnimListener != null) {
                        long onSelectAnim = ((PictureCommonFragment) PictureSelectorFragment.this).selectorConfig.onSelectAnimListener.onSelectAnim(view);
                        if (onSelectAnim > 0) {
                            int unused = PictureSelectorFragment.SELECT_ANIM_DURATION = (int) onSelectAnim;
                        }
                    } else {
                        Animation loadAnimation = AnimationUtils.loadAnimation(PictureSelectorFragment.this.getContext(), R.anim.ps_anim_modal_in);
                        int unused2 = PictureSelectorFragment.SELECT_ANIM_DURATION = (int) loadAnimation.getDuration();
                        view.startAnimation(loadAnimation);
                    }
                }
                return confirmSelect;
            }

            @Override // com.luck.picture.lib.adapter.PictureImageGridAdapter.OnItemClickListener
            public void openCameraClick() {
                if (DoubleUtils.isFastDoubleClick()) {
                    return;
                }
                PictureSelectorFragment.this.openSelectedCamera();
            }
        });
        this.mRecycler.setOnRecyclerViewScrollStateListener(new OnRecyclerViewScrollStateListener() { // from class: com.luck.picture.lib.PictureSelectorFragment.17
            @Override // com.luck.picture.lib.interfaces.OnRecyclerViewScrollStateListener
            public void onScrollFast() {
                if (((PictureCommonFragment) PictureSelectorFragment.this).selectorConfig.imageEngine != null) {
                    ((PictureCommonFragment) PictureSelectorFragment.this).selectorConfig.imageEngine.pauseRequests(PictureSelectorFragment.this.getContext());
                }
            }

            @Override // com.luck.picture.lib.interfaces.OnRecyclerViewScrollStateListener
            public void onScrollSlow() {
                if (((PictureCommonFragment) PictureSelectorFragment.this).selectorConfig.imageEngine != null) {
                    ((PictureCommonFragment) PictureSelectorFragment.this).selectorConfig.imageEngine.resumeRequests(PictureSelectorFragment.this.getContext());
                }
            }
        });
        this.mRecycler.setOnRecyclerViewScrollListener(new OnRecyclerViewScrollListener() { // from class: com.luck.picture.lib.PictureSelectorFragment.18
            @Override // com.luck.picture.lib.interfaces.OnRecyclerViewScrollListener
            public void onScrollStateChanged(int i4) {
                if (i4 == 1) {
                    PictureSelectorFragment.this.showCurrentMediaCreateTimeUI();
                } else if (i4 == 0) {
                    PictureSelectorFragment.this.hideCurrentMediaCreateTimeUI();
                }
            }

            @Override // com.luck.picture.lib.interfaces.OnRecyclerViewScrollListener
            public void onScrolled(int i4, int i5) {
                PictureSelectorFragment.this.setCurrentMediaCreateTimeText();
            }
        });
        if (this.selectorConfig.isFastSlidingSelect) {
            final HashSet hashSet = new HashSet();
            SlideSelectTouchListener withSelectListener = new SlideSelectTouchListener().setRecyclerViewHeaderCount(this.mAdapter.isDisplayCamera() ? 1 : 0).withSelectListener(new SlideSelectionHandler(new SlideSelectionHandler.ISelectionHandler() { // from class: com.luck.picture.lib.PictureSelectorFragment.19
                @Override // com.luck.picture.lib.widget.SlideSelectionHandler.ISelectionHandler
                public void changeSelection(int i4, int i5, boolean z4, boolean z5) {
                    ArrayList<LocalMedia> data = PictureSelectorFragment.this.mAdapter.getData();
                    if (data.size() == 0 || i4 > data.size()) {
                        return;
                    }
                    LocalMedia localMedia = data.get(i4);
                    PictureSelectorFragment pictureSelectorFragment = PictureSelectorFragment.this;
                    PictureSelectorFragment.this.mDragSelectTouchListener.setActive(pictureSelectorFragment.confirmSelect(localMedia, ((PictureCommonFragment) pictureSelectorFragment).selectorConfig.getSelectedResult().contains(localMedia)) != -1);
                }

                @Override // com.luck.picture.lib.widget.SlideSelectionHandler.ISelectionHandler
                public HashSet<Integer> getSelection() {
                    for (int i4 = 0; i4 < ((PictureCommonFragment) PictureSelectorFragment.this).selectorConfig.getSelectCount(); i4++) {
                        hashSet.add(Integer.valueOf(((PictureCommonFragment) PictureSelectorFragment.this).selectorConfig.getSelectedResult().get(i4).position));
                    }
                    return hashSet;
                }
            }));
            this.mDragSelectTouchListener = withSelectListener;
            this.mRecycler.addOnItemTouchListener(withSelectListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void beginLoadData() {
        onPermissionExplainEvent(false, null);
        if (this.selectorConfig.isOnlySandboxDir) {
            loadOnlyInAppDirectoryAllMediaData();
        } else {
            loadAllAlbumData();
        }
    }

    private boolean checkNotifyStrategy(boolean z4) {
        SelectorConfig selectorConfig = this.selectorConfig;
        if (!selectorConfig.isMaxSelectEnabledMask) {
            return false;
        }
        if (selectorConfig.isWithVideoImage) {
            if (selectorConfig.selectionMode == 1) {
                return false;
            }
            int selectCount = selectorConfig.getSelectCount();
            SelectorConfig selectorConfig2 = this.selectorConfig;
            if (selectCount != selectorConfig2.maxSelectNum && (z4 || selectorConfig2.getSelectCount() != this.selectorConfig.maxSelectNum - 1)) {
                return false;
            }
        } else if (selectorConfig.getSelectCount() != 0 && (!z4 || this.selectorConfig.getSelectCount() != 1)) {
            if (PictureMimeType.isHasVideo(this.selectorConfig.getResultFirstMimeType())) {
                SelectorConfig selectorConfig3 = this.selectorConfig;
                int i4 = selectorConfig3.maxVideoSelectNum;
                if (i4 <= 0) {
                    i4 = selectorConfig3.maxSelectNum;
                }
                if (selectorConfig3.getSelectCount() != i4 && (z4 || this.selectorConfig.getSelectCount() != i4 - 1)) {
                    return false;
                }
            } else {
                int selectCount2 = this.selectorConfig.getSelectCount();
                SelectorConfig selectorConfig4 = this.selectorConfig;
                if (selectCount2 != selectorConfig4.maxSelectNum && (z4 || selectorConfig4.getSelectCount() != this.selectorConfig.maxSelectNum - 1)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleAllAlbumData(boolean z4, List<LocalMediaFolder> list) {
        LocalMediaFolder localMediaFolder;
        if (ActivityCompatHelper.isDestroy(getActivity())) {
            return;
        }
        if (list.size() <= 0) {
            showDataNull();
            return;
        }
        if (z4) {
            localMediaFolder = list.get(0);
            this.selectorConfig.currentLocalMediaFolder = localMediaFolder;
        } else {
            localMediaFolder = this.selectorConfig.currentLocalMediaFolder;
            if (localMediaFolder == null) {
                localMediaFolder = list.get(0);
                this.selectorConfig.currentLocalMediaFolder = localMediaFolder;
            }
        }
        this.titleBar.setTitle(localMediaFolder.getFolderName());
        this.albumListPopWindow.bindAlbumData(list);
        SelectorConfig selectorConfig = this.selectorConfig;
        if (!selectorConfig.isPageStrategy) {
            setAdapterData(localMediaFolder.getData());
        } else if (selectorConfig.isPreloadFirst) {
            this.mRecycler.setEnabledLoadMore(true);
        } else {
            loadFirstPageMediaData(localMediaFolder.getBucketId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleFirstPageMedia(ArrayList<LocalMedia> arrayList, boolean z4) {
        if (ActivityCompatHelper.isDestroy(getActivity())) {
            return;
        }
        this.mRecycler.setEnabledLoadMore(z4);
        if (this.mRecycler.isEnabledLoadMore() && arrayList.size() == 0) {
            onRecyclerViewPreloadMore();
        } else {
            setAdapterData(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleInAppDirAllMedia(LocalMediaFolder localMediaFolder) {
        if (ActivityCompatHelper.isDestroy(getActivity())) {
            return;
        }
        String str = this.selectorConfig.sandboxDir;
        boolean z4 = localMediaFolder != null;
        this.titleBar.setTitle(z4 ? localMediaFolder.getFolderName() : new File(str).getName());
        if (!z4) {
            showDataNull();
        } else {
            this.selectorConfig.currentLocalMediaFolder = localMediaFolder;
            setAdapterData(localMediaFolder.getData());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleMoreMediaData(List<LocalMedia> list, boolean z4) {
        if (ActivityCompatHelper.isDestroy(getActivity())) {
            return;
        }
        this.mRecycler.setEnabledLoadMore(z4);
        if (this.mRecycler.isEnabledLoadMore()) {
            removePageCameraRepeatData(list);
            if (list.size() > 0) {
                int size = this.mAdapter.getData().size();
                this.mAdapter.getData().addAll(list);
                PictureImageGridAdapter pictureImageGridAdapter = this.mAdapter;
                pictureImageGridAdapter.notifyItemRangeChanged(size, pictureImageGridAdapter.getItemCount());
                hideDataNull();
            } else {
                onRecyclerViewPreloadMore();
            }
            if (list.size() < 10) {
                RecyclerPreloadView recyclerPreloadView = this.mRecycler;
                recyclerPreloadView.onScrolled(recyclerPreloadView.getScrollX(), this.mRecycler.getScrollY());
            }
        }
    }

    private void handleRecoverAlbumData(List<LocalMediaFolder> list) {
        if (ActivityCompatHelper.isDestroy(getActivity())) {
            return;
        }
        if (list.size() <= 0) {
            showDataNull();
            return;
        }
        LocalMediaFolder localMediaFolder = this.selectorConfig.currentLocalMediaFolder;
        if (localMediaFolder == null) {
            localMediaFolder = list.get(0);
            this.selectorConfig.currentLocalMediaFolder = localMediaFolder;
        }
        this.titleBar.setTitle(localMediaFolder.getFolderName());
        this.albumListPopWindow.bindAlbumData(list);
        if (this.selectorConfig.isPageStrategy) {
            handleFirstPageMedia(new ArrayList<>(this.selectorConfig.dataSource), true);
        } else {
            setAdapterData(localMediaFolder.getData());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleSwitchAlbum(ArrayList<LocalMedia> arrayList, boolean z4) {
        if (ActivityCompatHelper.isDestroy(getActivity())) {
            return;
        }
        this.mRecycler.setEnabledLoadMore(z4);
        if (arrayList.size() == 0) {
            this.mAdapter.getData().clear();
        }
        setAdapterData(arrayList);
        this.mRecycler.onScrolled(0, 0);
        this.mRecycler.smoothScrollToPosition(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideCurrentMediaCreateTimeUI() {
        if (!this.selectorConfig.isDisplayTimeAxis || this.mAdapter.getData().size() <= 0) {
            return;
        }
        this.tvCurrentDataTime.animate().setDuration(250L).alpha(0.0f).start();
    }

    private void hideDataNull() {
        if (this.tvDataEmpty.getVisibility() == 0) {
            this.tvDataEmpty.setVisibility(8);
        }
    }

    private void initAlbumListPopWindow() {
        AlbumListPopWindow buildPopWindow = AlbumListPopWindow.buildPopWindow(getContext(), this.selectorConfig);
        this.albumListPopWindow = buildPopWindow;
        buildPopWindow.setOnPopupWindowStatusListener(new AlbumListPopWindow.OnPopupWindowStatusListener() { // from class: com.luck.picture.lib.PictureSelectorFragment.4
            @Override // com.luck.picture.lib.dialog.AlbumListPopWindow.OnPopupWindowStatusListener
            public void onDismissPopupWindow() {
                if (((PictureCommonFragment) PictureSelectorFragment.this).selectorConfig.isOnlySandboxDir) {
                    return;
                }
                AnimUtils.rotateArrow(PictureSelectorFragment.this.titleBar.getImageArrow(), false);
            }

            @Override // com.luck.picture.lib.dialog.AlbumListPopWindow.OnPopupWindowStatusListener
            public void onShowPopupWindow() {
                if (((PictureCommonFragment) PictureSelectorFragment.this).selectorConfig.isOnlySandboxDir) {
                    return;
                }
                AnimUtils.rotateArrow(PictureSelectorFragment.this.titleBar.getImageArrow(), true);
            }
        });
        addAlbumPopWindowAction();
    }

    private void initBottomNavBar() {
        this.bottomNarBar.setBottomNavBarStyle();
        this.bottomNarBar.setOnBottomNavBarListener(new BottomNavBar.OnBottomNavBarListener() { // from class: com.luck.picture.lib.PictureSelectorFragment.8
            @Override // com.luck.picture.lib.widget.BottomNavBar.OnBottomNavBarListener
            public void onCheckOriginalChange() {
                PictureSelectorFragment.this.sendSelectedOriginalChangeEvent();
            }

            @Override // com.luck.picture.lib.widget.BottomNavBar.OnBottomNavBarListener
            public void onPreview() {
                PictureSelectorFragment.this.onStartPreview(0, true);
            }
        });
        this.bottomNarBar.setSelectedChange();
    }

    private void initComplete() {
        SelectorConfig selectorConfig = this.selectorConfig;
        if (selectorConfig.selectionMode == 1 && selectorConfig.isDirectReturnSingle) {
            selectorConfig.selectorStyle.getTitleBarStyle().setHideCancelButton(false);
            this.titleBar.getTitleCancelView().setVisibility(0);
            this.completeSelectView.setVisibility(8);
            return;
        }
        this.completeSelectView.setCompleteSelectViewStyle();
        this.completeSelectView.setSelectedChange(false);
        if (this.selectorConfig.selectorStyle.getSelectMainStyle().isCompleteSelectRelativeTop()) {
            if (this.completeSelectView.getLayoutParams() instanceof ConstraintLayout.LayoutParams) {
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.completeSelectView.getLayoutParams();
                int i4 = R.id.title_bar;
                layoutParams.f23845j = i4;
                ((ConstraintLayout.LayoutParams) this.completeSelectView.getLayoutParams()).f23851m = i4;
                if (this.selectorConfig.isPreviewFullScreenMode) {
                    ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) this.completeSelectView.getLayoutParams())).topMargin = DensityUtil.getStatusBarHeight(getContext());
                }
            } else if ((this.completeSelectView.getLayoutParams() instanceof RelativeLayout.LayoutParams) && this.selectorConfig.isPreviewFullScreenMode) {
                ((RelativeLayout.LayoutParams) this.completeSelectView.getLayoutParams()).topMargin = DensityUtil.getStatusBarHeight(getContext());
            }
        }
        this.completeSelectView.setOnClickListener(new View.OnClickListener() { // from class: com.luck.picture.lib.PictureSelectorFragment.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (((PictureCommonFragment) PictureSelectorFragment.this).selectorConfig.isEmptyResultReturn && ((PictureCommonFragment) PictureSelectorFragment.this).selectorConfig.getSelectCount() == 0) {
                    PictureSelectorFragment.this.onExitPictureSelector();
                } else {
                    PictureSelectorFragment.this.dispatchTransformResult();
                }
            }
        });
    }

    private void initRecycler(View view) {
        this.mRecycler = (RecyclerPreloadView) view.findViewById(R.id.recycler);
        SelectMainStyle selectMainStyle = this.selectorConfig.selectorStyle.getSelectMainStyle();
        int mainListBackgroundColor = selectMainStyle.getMainListBackgroundColor();
        if (StyleUtils.checkStyleValidity(mainListBackgroundColor)) {
            this.mRecycler.setBackgroundColor(mainListBackgroundColor);
        } else {
            this.mRecycler.setBackgroundColor(d.getColor(getAppContext(), R.color.ps_color_black));
        }
        int i4 = this.selectorConfig.imageSpanCount;
        if (i4 <= 0) {
            i4 = 4;
        }
        if (this.mRecycler.getItemDecorationCount() == 0) {
            if (StyleUtils.checkSizeValidity(selectMainStyle.getAdapterItemSpacingSize())) {
                this.mRecycler.addItemDecoration(new GridSpacingItemDecoration(i4, selectMainStyle.getAdapterItemSpacingSize(), selectMainStyle.isAdapterItemIncludeEdge()));
            } else {
                this.mRecycler.addItemDecoration(new GridSpacingItemDecoration(i4, DensityUtil.dip2px(view.getContext(), 1.0f), selectMainStyle.isAdapterItemIncludeEdge()));
            }
        }
        this.mRecycler.setLayoutManager(new GridLayoutManager(getContext(), i4));
        RecyclerView.m itemAnimator = this.mRecycler.getItemAnimator();
        if (itemAnimator != null) {
            ((d0) itemAnimator).setSupportsChangeAnimations(false);
            this.mRecycler.setItemAnimator(null);
        }
        if (this.selectorConfig.isPageStrategy) {
            this.mRecycler.setReachBottomRow(2);
            this.mRecycler.setOnRecyclerViewPreloadListener(this);
        } else {
            this.mRecycler.setHasFixedSize(true);
        }
        PictureImageGridAdapter pictureImageGridAdapter = new PictureImageGridAdapter(getContext(), this.selectorConfig);
        this.mAdapter = pictureImageGridAdapter;
        pictureImageGridAdapter.setDisplayCamera(this.isDisplayCamera);
        int i5 = this.selectorConfig.animationMode;
        if (i5 == 1) {
            this.mRecycler.setAdapter(new AlphaInAnimationAdapter(this.mAdapter));
        } else if (i5 != 2) {
            this.mRecycler.setAdapter(this.mAdapter);
        } else {
            this.mRecycler.setAdapter(new SlideInBottomAnimationAdapter(this.mAdapter));
        }
        addRecyclerAction();
    }

    private void initTitleBar() {
        if (this.selectorConfig.selectorStyle.getTitleBarStyle().isHideTitleBar()) {
            this.titleBar.setVisibility(8);
        }
        this.titleBar.setTitleBarStyle();
        this.titleBar.setOnTitleBarListener(new TitleBar.OnTitleBarListener() { // from class: com.luck.picture.lib.PictureSelectorFragment.3
            @Override // com.luck.picture.lib.widget.TitleBar.OnTitleBarListener
            public void onBackPressed() {
                if (PictureSelectorFragment.this.albumListPopWindow.isShowing()) {
                    PictureSelectorFragment.this.albumListPopWindow.dismiss();
                } else {
                    PictureSelectorFragment.this.onKeyBackFragmentFinish();
                }
            }

            @Override // com.luck.picture.lib.widget.TitleBar.OnTitleBarListener
            public void onShowAlbumPopWindow(View view) {
                PictureSelectorFragment.this.albumListPopWindow.showAsDropDown(view);
            }

            @Override // com.luck.picture.lib.widget.TitleBar.OnTitleBarListener
            public void onTitleDoubleClick() {
                if (((PictureCommonFragment) PictureSelectorFragment.this).selectorConfig.isAutomaticTitleRecyclerTop) {
                    if (SystemClock.uptimeMillis() - PictureSelectorFragment.this.intervalClickTime < 500 && PictureSelectorFragment.this.mAdapter.getItemCount() > 0) {
                        PictureSelectorFragment.this.mRecycler.scrollToPosition(0);
                    } else {
                        PictureSelectorFragment.this.intervalClickTime = SystemClock.uptimeMillis();
                    }
                }
            }
        });
    }

    private boolean isAddSameImp(int i4) {
        int i5;
        return i4 != 0 && (i5 = this.allFolderSize) > 0 && i5 < i4;
    }

    private void mergeFolder(LocalMedia localMedia) {
        LocalMediaFolder folder;
        LocalMediaFolder localMediaFolder;
        String str;
        List<LocalMediaFolder> albumList = this.albumListPopWindow.getAlbumList();
        if (this.albumListPopWindow.getFolderCount() == 0) {
            folder = new LocalMediaFolder();
            if (TextUtils.isEmpty(this.selectorConfig.defaultAlbumName)) {
                str = getString(this.selectorConfig.chooseMode == SelectMimeType.ofAudio() ? R.string.ps_all_audio : R.string.ps_camera_roll);
            } else {
                str = this.selectorConfig.defaultAlbumName;
            }
            folder.setFolderName(str);
            folder.setFirstImagePath("");
            folder.setBucketId(-1L);
            albumList.add(0, folder);
        } else {
            folder = this.albumListPopWindow.getFolder(0);
        }
        folder.setFirstImagePath(localMedia.getPath());
        folder.setFirstMimeType(localMedia.getMimeType());
        folder.setData(this.mAdapter.getData());
        folder.setBucketId(-1L);
        folder.setFolderTotalNum(isAddSameImp(folder.getFolderTotalNum()) ? folder.getFolderTotalNum() : folder.getFolderTotalNum() + 1);
        LocalMediaFolder localMediaFolder2 = this.selectorConfig.currentLocalMediaFolder;
        if (localMediaFolder2 == null || localMediaFolder2.getFolderTotalNum() == 0) {
            this.selectorConfig.currentLocalMediaFolder = folder;
        }
        int i4 = 0;
        while (true) {
            if (i4 >= albumList.size()) {
                localMediaFolder = null;
                break;
            }
            localMediaFolder = albumList.get(i4);
            if (TextUtils.equals(localMediaFolder.getFolderName(), localMedia.getParentFolderName())) {
                break;
            } else {
                i4++;
            }
        }
        if (localMediaFolder == null) {
            localMediaFolder = new LocalMediaFolder();
            albumList.add(localMediaFolder);
        }
        localMediaFolder.setFolderName(localMedia.getParentFolderName());
        if (localMediaFolder.getBucketId() == -1 || localMediaFolder.getBucketId() == 0) {
            localMediaFolder.setBucketId(localMedia.getBucketId());
        }
        if (this.selectorConfig.isPageStrategy) {
            localMediaFolder.setHasMore(true);
        } else if (!isAddSameImp(folder.getFolderTotalNum()) || !TextUtils.isEmpty(this.selectorConfig.outPutCameraDir) || !TextUtils.isEmpty(this.selectorConfig.outPutAudioDir)) {
            localMediaFolder.getData().add(0, localMedia);
        }
        localMediaFolder.setFolderTotalNum(isAddSameImp(folder.getFolderTotalNum()) ? localMediaFolder.getFolderTotalNum() : localMediaFolder.getFolderTotalNum() + 1);
        localMediaFolder.setFirstImagePath(this.selectorConfig.cameraPath);
        localMediaFolder.setFirstMimeType(localMedia.getMimeType());
        this.albumListPopWindow.bindAlbumData(albumList);
    }

    public static PictureSelectorFragment newInstance() {
        PictureSelectorFragment pictureSelectorFragment = new PictureSelectorFragment();
        pictureSelectorFragment.setArguments(new Bundle());
        return pictureSelectorFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onStartPreview(int r13, boolean r14) {
        /*
            r12 = this;
            androidx.fragment.app.FragmentActivity r0 = r12.getActivity()
            java.lang.String r10 = com.luck.picture.lib.PictureSelectorPreviewFragment.TAG
            boolean r0 = com.luck.picture.lib.utils.ActivityCompatHelper.checkFragmentNonExits(r0, r10)
            if (r0 == 0) goto Lbe
            r0 = 0
            if (r14 == 0) goto L24
            java.util.ArrayList r1 = new java.util.ArrayList
            com.luck.picture.lib.config.SelectorConfig r2 = r12.selectorConfig
            java.util.ArrayList r2 = r2.getSelectedResult()
            r1.<init>(r2)
            int r2 = r1.size()
            r3 = 0
        L20:
            r9 = r1
            r5 = r2
            r7 = r3
            goto L59
        L24:
            java.util.ArrayList r1 = new java.util.ArrayList
            com.luck.picture.lib.adapter.PictureImageGridAdapter r2 = r12.mAdapter
            java.util.ArrayList r2 = r2.getData()
            r1.<init>(r2)
            com.luck.picture.lib.config.SelectorConfig r2 = r12.selectorConfig
            com.luck.picture.lib.entity.LocalMediaFolder r2 = r2.currentLocalMediaFolder
            if (r2 == 0) goto L41
            int r3 = r2.getFolderTotalNum()
            long r4 = r2.getBucketId()
            r9 = r1
            r7 = r4
            r5 = r3
            goto L59
        L41:
            int r2 = r1.size()
            int r3 = r1.size()
            if (r3 <= 0) goto L56
            java.lang.Object r3 = r1.get(r0)
            com.luck.picture.lib.entity.LocalMedia r3 = (com.luck.picture.lib.entity.LocalMedia) r3
            long r3 = r3.getBucketId()
            goto L20
        L56:
            r3 = -1
            goto L20
        L59:
            if (r14 != 0) goto L73
            com.luck.picture.lib.config.SelectorConfig r1 = r12.selectorConfig
            boolean r2 = r1.isPreviewZoomEffect
            if (r2 == 0) goto L73
            com.luck.picture.lib.widget.RecyclerPreloadView r2 = r12.mRecycler
            boolean r1 = r1.isPreviewFullScreenMode
            if (r1 == 0) goto L68
            goto L70
        L68:
            android.content.Context r0 = r12.getContext()
            int r0 = com.luck.picture.lib.utils.DensityUtil.getStatusBarHeight(r0)
        L70:
            com.luck.picture.lib.magical.BuildRecycleItemViewParams.generateViewParams(r2, r0)
        L73:
            com.luck.picture.lib.config.SelectorConfig r0 = r12.selectorConfig
            com.luck.picture.lib.interfaces.OnPreviewInterceptListener r0 = r0.onPreviewInterceptListener
            if (r0 == 0) goto L95
            android.content.Context r1 = r12.getContext()
            int r4 = r12.mPage
            com.luck.picture.lib.widget.TitleBar r2 = r12.titleBar
            java.lang.String r10 = r2.getTitleText()
            com.luck.picture.lib.adapter.PictureImageGridAdapter r2 = r12.mAdapter
            boolean r11 = r2.isDisplayCamera()
            r2 = r13
            r3 = r5
            r5 = r7
            r7 = r10
            r8 = r11
            r10 = r14
            r0.onPreview(r1, r2, r3, r4, r5, r7, r8, r9, r10)
            goto Lbe
        L95:
            androidx.fragment.app.FragmentActivity r0 = r12.getActivity()
            boolean r0 = com.luck.picture.lib.utils.ActivityCompatHelper.checkFragmentNonExits(r0, r10)
            if (r0 == 0) goto Lbe
            com.luck.picture.lib.PictureSelectorPreviewFragment r11 = com.luck.picture.lib.PictureSelectorPreviewFragment.newInstance()
            com.luck.picture.lib.widget.TitleBar r0 = r12.titleBar
            java.lang.String r2 = r0.getTitleText()
            com.luck.picture.lib.adapter.PictureImageGridAdapter r0 = r12.mAdapter
            boolean r3 = r0.isDisplayCamera()
            int r6 = r12.mPage
            r0 = r11
            r1 = r14
            r4 = r13
            r0.setInternalPreviewData(r1, r2, r3, r4, r5, r6, r7, r9)
            androidx.fragment.app.FragmentActivity r0 = r12.getActivity()
            com.luck.picture.lib.basic.FragmentInjectManager.injectFragment(r0, r10, r11)
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luck.picture.lib.PictureSelectorFragment.onStartPreview(int, boolean):void");
    }

    private boolean preloadPageFirstData() {
        Context requireContext;
        int i4;
        SelectorConfig selectorConfig = this.selectorConfig;
        if (!selectorConfig.isPageStrategy || !selectorConfig.isPreloadFirst) {
            return false;
        }
        LocalMediaFolder localMediaFolder = new LocalMediaFolder();
        localMediaFolder.setBucketId(-1L);
        if (TextUtils.isEmpty(this.selectorConfig.defaultAlbumName)) {
            TitleBar titleBar = this.titleBar;
            if (this.selectorConfig.chooseMode == SelectMimeType.ofAudio()) {
                requireContext = requireContext();
                i4 = R.string.ps_all_audio;
            } else {
                requireContext = requireContext();
                i4 = R.string.ps_camera_roll;
            }
            titleBar.setTitle(requireContext.getString(i4));
        } else {
            this.titleBar.setTitle(this.selectorConfig.defaultAlbumName);
        }
        localMediaFolder.setFolderName(this.titleBar.getTitleText());
        this.selectorConfig.currentLocalMediaFolder = localMediaFolder;
        loadFirstPageMediaData(localMediaFolder.getBucketId());
        return true;
    }

    private void recoverSaveInstanceData() {
        this.mAdapter.setDisplayCamera(this.isDisplayCamera);
        setEnterAnimationDuration(0L);
        SelectorConfig selectorConfig = this.selectorConfig;
        if (selectorConfig.isOnlySandboxDir) {
            handleInAppDirAllMedia(selectorConfig.currentLocalMediaFolder);
        } else {
            handleRecoverAlbumData(new ArrayList(this.selectorConfig.albumDataSource));
        }
    }

    private void recoveryRecyclerPosition() {
        if (this.currentPosition > 0) {
            this.mRecycler.post(new Runnable() { // from class: com.luck.picture.lib.PictureSelectorFragment.15
                @Override // java.lang.Runnable
                public void run() {
                    PictureSelectorFragment.this.mRecycler.scrollToPosition(PictureSelectorFragment.this.currentPosition);
                    PictureSelectorFragment.this.mRecycler.setLastVisiblePosition(PictureSelectorFragment.this.currentPosition);
                }
            });
        }
    }

    private void removePageCameraRepeatData(List<LocalMedia> list) {
        try {
            try {
                if (this.selectorConfig.isPageStrategy && this.isCameraCallback) {
                    synchronized (LOCK) {
                        try {
                            Iterator<LocalMedia> it = list.iterator();
                            while (it.hasNext()) {
                                if (this.mAdapter.getData().contains(it.next())) {
                                    it.remove();
                                }
                            }
                        } finally {
                        }
                    }
                }
            } finally {
                this.isCameraCallback = false;
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    private void requestLoadData() {
        this.mAdapter.setDisplayCamera(this.isDisplayCamera);
        if (PermissionChecker.isCheckReadStorage(this.selectorConfig.chooseMode, getContext())) {
            beginLoadData();
            return;
        }
        final String[] readPermissionArray = PermissionConfig.getReadPermissionArray(getAppContext(), this.selectorConfig.chooseMode);
        onPermissionExplainEvent(true, readPermissionArray);
        if (this.selectorConfig.onPermissionsEventListener != null) {
            onApplyPermissionsEvent(-1, readPermissionArray);
        } else {
            PermissionChecker.getInstance().requestPermissions(this, readPermissionArray, new PermissionResultCallback() { // from class: com.luck.picture.lib.PictureSelectorFragment.5
                @Override // com.luck.picture.lib.permissions.PermissionResultCallback
                public void onDenied() {
                    PictureSelectorFragment.this.handlePermissionDenied(readPermissionArray);
                }

                @Override // com.luck.picture.lib.permissions.PermissionResultCallback
                public void onGranted() {
                    PictureSelectorFragment.this.beginLoadData();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NotifyDataSetChanged"})
    public void setAdapterData(final ArrayList<LocalMedia> arrayList) {
        long enterAnimationDuration = getEnterAnimationDuration();
        if (enterAnimationDuration > 0) {
            requireView().postDelayed(new Runnable() { // from class: com.luck.picture.lib.PictureSelectorFragment.20
                @Override // java.lang.Runnable
                public void run() {
                    PictureSelectorFragment.this.setAdapterDataComplete(arrayList);
                }
            }, enterAnimationDuration);
        } else {
            setAdapterDataComplete(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdapterDataComplete(ArrayList<LocalMedia> arrayList) {
        setEnterAnimationDuration(0L);
        sendChangeSubSelectPositionEvent(false);
        this.mAdapter.setDataAndDataSetChanged(arrayList);
        this.selectorConfig.dataSource.clear();
        this.selectorConfig.albumDataSource.clear();
        recoveryRecyclerPosition();
        if (this.mAdapter.isDataEmpty()) {
            showDataNull();
        } else {
            hideDataNull();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentMediaCreateTimeText() {
        int firstVisiblePosition;
        if (!this.selectorConfig.isDisplayTimeAxis || (firstVisiblePosition = this.mRecycler.getFirstVisiblePosition()) == -1) {
            return;
        }
        ArrayList<LocalMedia> data = this.mAdapter.getData();
        if (data.size() <= firstVisiblePosition || data.get(firstVisiblePosition).getDateAddedTime() <= 0) {
            return;
        }
        this.tvCurrentDataTime.setText(DateUtils.getDataFormat(getContext(), data.get(firstVisiblePosition).getDateAddedTime()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showCurrentMediaCreateTimeUI() {
        if (this.selectorConfig.isDisplayTimeAxis && this.mAdapter.getData().size() > 0 && this.tvCurrentDataTime.getAlpha() == 0.0f) {
            this.tvCurrentDataTime.animate().setDuration(150L).alphaBy(1.0f).start();
        }
    }

    private void showDataNull() {
        LocalMediaFolder localMediaFolder = this.selectorConfig.currentLocalMediaFolder;
        if (localMediaFolder == null || localMediaFolder.getBucketId() == -1) {
            if (this.tvDataEmpty.getVisibility() == 8) {
                this.tvDataEmpty.setVisibility(0);
            }
            this.tvDataEmpty.setCompoundDrawablesRelativeWithIntrinsicBounds(0, R.drawable.ps_ic_no_data, 0, 0);
            this.tvDataEmpty.setText(getString(this.selectorConfig.chooseMode == SelectMimeType.ofAudio() ? R.string.ps_audio_empty : R.string.ps_empty));
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void dispatchCameraMediaResult(LocalMedia localMedia) {
        if (!isAddSameImp(this.albumListPopWindow.getFirstAlbumImageCount())) {
            this.mAdapter.getData().add(0, localMedia);
            this.isCameraCallback = true;
        }
        SelectorConfig selectorConfig = this.selectorConfig;
        if (selectorConfig.selectionMode == 1 && selectorConfig.isDirectReturnSingle) {
            selectorConfig.selectedResult.clear();
            if (confirmSelect(localMedia, false) == 0) {
                dispatchTransformResult();
            }
        } else {
            confirmSelect(localMedia, false);
        }
        this.mAdapter.notifyItemInserted(this.selectorConfig.isDisplayCamera ? 1 : 0);
        PictureImageGridAdapter pictureImageGridAdapter = this.mAdapter;
        boolean z4 = this.selectorConfig.isDisplayCamera;
        pictureImageGridAdapter.notifyItemRangeChanged(z4 ? 1 : 0, pictureImageGridAdapter.getData().size());
        SelectorConfig selectorConfig2 = this.selectorConfig;
        if (selectorConfig2.isOnlySandboxDir) {
            LocalMediaFolder localMediaFolder = selectorConfig2.currentLocalMediaFolder;
            if (localMediaFolder == null) {
                localMediaFolder = new LocalMediaFolder();
            }
            localMediaFolder.setBucketId(ValueOf.toLong(Integer.valueOf(localMedia.getParentFolderName().hashCode())));
            localMediaFolder.setFolderName(localMedia.getParentFolderName());
            localMediaFolder.setFirstMimeType(localMedia.getMimeType());
            localMediaFolder.setFirstImagePath(localMedia.getPath());
            localMediaFolder.setFolderTotalNum(this.mAdapter.getData().size());
            localMediaFolder.setCurrentDataPage(this.mPage);
            localMediaFolder.setHasMore(false);
            localMediaFolder.setData(this.mAdapter.getData());
            this.mRecycler.setEnabledLoadMore(false);
            this.selectorConfig.currentLocalMediaFolder = localMediaFolder;
        } else {
            mergeFolder(localMedia);
        }
        this.allFolderSize = 0;
        if (this.mAdapter.getData().size() > 0 || this.selectorConfig.isDirectReturnSingle) {
            hideDataNull();
        } else {
            showDataNull();
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public String getFragmentTag() {
        return TAG;
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public int getResourceId() {
        int layoutResource = InjectResourceSource.getLayoutResource(getContext(), 1, this.selectorConfig);
        return layoutResource != 0 ? layoutResource : R.layout.ps_fragment_selector;
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void handlePermissionSettingResult(String[] strArr) {
        if (strArr == null) {
            return;
        }
        onPermissionExplainEvent(false, null);
        boolean z4 = strArr.length > 0 && TextUtils.equals(strArr[0], PermissionConfig.CAMERA[0]);
        OnPermissionsInterceptListener onPermissionsInterceptListener = this.selectorConfig.onPermissionsEventListener;
        if (onPermissionsInterceptListener != null ? onPermissionsInterceptListener.hasPermissions(this, strArr) : PermissionChecker.isCheckSelfPermission(getContext(), strArr)) {
            if (z4) {
                openSelectedCamera();
            } else {
                beginLoadData();
            }
        } else if (z4) {
            ToastUtils.showToast(getContext(), getString(R.string.ps_camera));
        } else {
            ToastUtils.showToast(getContext(), getString(R.string.ps_jurisdiction));
            onKeyBackFragmentFinish();
        }
        PermissionConfig.CURRENT_REQUEST_PERMISSION = new String[0];
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorEvent
    public void loadAllAlbumData() {
        ExtendLoaderEngine extendLoaderEngine = this.selectorConfig.loaderDataEngine;
        if (extendLoaderEngine != null) {
            extendLoaderEngine.loadAllAlbumData(getContext(), new OnQueryAllAlbumListener<LocalMediaFolder>() { // from class: com.luck.picture.lib.PictureSelectorFragment.9
                @Override // com.luck.picture.lib.interfaces.OnQueryAllAlbumListener
                public void onComplete(List<LocalMediaFolder> list) {
                    PictureSelectorFragment.this.handleAllAlbumData(false, list);
                }
            });
        } else {
            final boolean preloadPageFirstData = preloadPageFirstData();
            this.mLoader.loadAllAlbum(new OnQueryAllAlbumListener<LocalMediaFolder>() { // from class: com.luck.picture.lib.PictureSelectorFragment.10
                @Override // com.luck.picture.lib.interfaces.OnQueryAllAlbumListener
                public void onComplete(List<LocalMediaFolder> list) {
                    PictureSelectorFragment.this.handleAllAlbumData(preloadPageFirstData, list);
                }
            });
        }
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorEvent
    public void loadFirstPageMediaData(long j4) {
        this.mPage = 1;
        this.mRecycler.setEnabledLoadMore(true);
        SelectorConfig selectorConfig = this.selectorConfig;
        ExtendLoaderEngine extendLoaderEngine = selectorConfig.loaderDataEngine;
        if (extendLoaderEngine != null) {
            Context context = getContext();
            int i4 = this.mPage;
            extendLoaderEngine.loadFirstPageMediaData(context, j4, i4, i4 * this.selectorConfig.pageSize, new OnQueryDataResultListener<LocalMedia>() { // from class: com.luck.picture.lib.PictureSelectorFragment.11
                @Override // com.luck.picture.lib.interfaces.OnQueryDataResultListener
                public void onComplete(ArrayList<LocalMedia> arrayList, boolean z4) {
                    PictureSelectorFragment.this.handleFirstPageMedia(arrayList, z4);
                }
            });
        } else {
            IBridgeMediaLoader iBridgeMediaLoader = this.mLoader;
            int i5 = this.mPage;
            iBridgeMediaLoader.loadPageMediaData(j4, i5, i5 * selectorConfig.pageSize, new OnQueryDataResultListener<LocalMedia>() { // from class: com.luck.picture.lib.PictureSelectorFragment.12
                @Override // com.luck.picture.lib.interfaces.OnQueryDataResultListener
                public void onComplete(ArrayList<LocalMedia> arrayList, boolean z4) {
                    PictureSelectorFragment.this.handleFirstPageMedia(arrayList, z4);
                }
            });
        }
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorEvent
    public void loadMoreMediaData() {
        if (this.mRecycler.isEnabledLoadMore()) {
            this.mPage++;
            LocalMediaFolder localMediaFolder = this.selectorConfig.currentLocalMediaFolder;
            long bucketId = localMediaFolder != null ? localMediaFolder.getBucketId() : 0L;
            SelectorConfig selectorConfig = this.selectorConfig;
            ExtendLoaderEngine extendLoaderEngine = selectorConfig.loaderDataEngine;
            if (extendLoaderEngine == null) {
                this.mLoader.loadPageMediaData(bucketId, this.mPage, selectorConfig.pageSize, new OnQueryDataResultListener<LocalMedia>() { // from class: com.luck.picture.lib.PictureSelectorFragment.23
                    @Override // com.luck.picture.lib.interfaces.OnQueryDataResultListener
                    public void onComplete(ArrayList<LocalMedia> arrayList, boolean z4) {
                        PictureSelectorFragment.this.handleMoreMediaData(arrayList, z4);
                    }
                });
                return;
            }
            Context context = getContext();
            int i4 = this.mPage;
            int i5 = this.selectorConfig.pageSize;
            extendLoaderEngine.loadMoreMediaData(context, bucketId, i4, i5, i5, new OnQueryDataResultListener<LocalMedia>() { // from class: com.luck.picture.lib.PictureSelectorFragment.22
                @Override // com.luck.picture.lib.interfaces.OnQueryDataResultListener
                public void onComplete(ArrayList<LocalMedia> arrayList, boolean z4) {
                    PictureSelectorFragment.this.handleMoreMediaData(arrayList, z4);
                }
            });
        }
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorEvent
    public void loadOnlyInAppDirectoryAllMediaData() {
        ExtendLoaderEngine extendLoaderEngine = this.selectorConfig.loaderDataEngine;
        if (extendLoaderEngine != null) {
            extendLoaderEngine.loadOnlyInAppDirAllMediaData(getContext(), new OnQueryAlbumListener<LocalMediaFolder>() { // from class: com.luck.picture.lib.PictureSelectorFragment.13
                @Override // com.luck.picture.lib.interfaces.OnQueryAlbumListener
                public void onComplete(LocalMediaFolder localMediaFolder) {
                    PictureSelectorFragment.this.handleInAppDirAllMedia(localMediaFolder);
                }
            });
        } else {
            this.mLoader.loadOnlyInAppDirAllMedia(new OnQueryAlbumListener<LocalMediaFolder>() { // from class: com.luck.picture.lib.PictureSelectorFragment.14
                @Override // com.luck.picture.lib.interfaces.OnQueryAlbumListener
                public void onComplete(LocalMediaFolder localMediaFolder) {
                    PictureSelectorFragment.this.handleInAppDirAllMedia(localMediaFolder);
                }
            });
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void onApplyPermissionsEvent(int i4, String[] strArr) {
        if (i4 != -1) {
            super.onApplyPermissionsEvent(i4, strArr);
        } else {
            this.selectorConfig.onPermissionsEventListener.requestPermission(this, strArr, new OnRequestPermissionListener() { // from class: com.luck.picture.lib.PictureSelectorFragment.6
                @Override // com.luck.picture.lib.interfaces.OnRequestPermissionListener
                public void onCall(String[] strArr2, boolean z4) {
                    if (z4) {
                        PictureSelectorFragment.this.beginLoadData();
                    } else {
                        PictureSelectorFragment.this.handlePermissionDenied(strArr2);
                    }
                }
            });
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void onCheckOriginalChange() {
        this.bottomNarBar.setOriginalCheck();
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void onCreateLoader() {
        SelectorConfig selectorConfig = this.selectorConfig;
        IBridgeLoaderFactory iBridgeLoaderFactory = selectorConfig.loaderFactory;
        if (iBridgeLoaderFactory == null) {
            this.mLoader = selectorConfig.isPageStrategy ? new LocalMediaPageLoader(getAppContext(), this.selectorConfig) : new LocalMediaLoader(getAppContext(), this.selectorConfig);
            return;
        }
        IBridgeMediaLoader onCreateLoader = iBridgeLoaderFactory.onCreateLoader();
        this.mLoader = onCreateLoader;
        if (onCreateLoader != null) {
            return;
        }
        throw new NullPointerException(ProtectedSandApp.s("ᖚ\u0001") + IBridgeMediaLoader.class + ProtectedSandApp.s("ᖛ\u0001"));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        SlideSelectTouchListener slideSelectTouchListener = this.mDragSelectTouchListener;
        if (slideSelectTouchListener != null) {
            slideSelectTouchListener.stopAutoScroll();
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void onFixedSelectedChange(LocalMedia localMedia) {
        this.mAdapter.notifyItemPositionChanged(localMedia.position);
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void onFragmentResume() {
        setRootViewKeyListener(requireView());
    }

    @Override // com.luck.picture.lib.interfaces.OnRecyclerViewPreloadMoreListener
    public void onRecyclerViewPreloadMore() {
        if (this.isMemoryRecycling) {
            requireView().postDelayed(new Runnable() { // from class: com.luck.picture.lib.PictureSelectorFragment.21
                @Override // java.lang.Runnable
                public void run() {
                    PictureSelectorFragment.this.loadMoreMediaData();
                }
            }, 350L);
        } else {
            loadMoreMediaData();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@o0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(ProtectedSandApp.s("ᖜ\u0001"), this.allFolderSize);
        bundle.putInt(ProtectedSandApp.s("ᖝ\u0001"), this.mPage);
        RecyclerPreloadView recyclerPreloadView = this.mRecycler;
        if (recyclerPreloadView != null) {
            bundle.putInt(ProtectedSandApp.s("ᖞ\u0001"), recyclerPreloadView.getLastVisiblePosition());
        }
        PictureImageGridAdapter pictureImageGridAdapter = this.mAdapter;
        if (pictureImageGridAdapter != null) {
            bundle.putBoolean(ProtectedSandApp.s("ᖟ\u0001"), pictureImageGridAdapter.isDisplayCamera());
            this.selectorConfig.addDataSource(this.mAdapter.getData());
        }
        AlbumListPopWindow albumListPopWindow = this.albumListPopWindow;
        if (albumListPopWindow != null) {
            this.selectorConfig.addAlbumDataSource(albumListPopWindow.getAlbumList());
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    @SuppressLint({"NotifyDataSetChanged"})
    public void onSelectedChange(boolean z4, LocalMedia localMedia) {
        this.bottomNarBar.setSelectedChange();
        this.completeSelectView.setSelectedChange(false);
        if (checkNotifyStrategy(z4)) {
            this.mAdapter.notifyItemPositionChanged(localMedia.position);
            this.mRecycler.postDelayed(new Runnable() { // from class: com.luck.picture.lib.PictureSelectorFragment.1
                @Override // java.lang.Runnable
                public void run() {
                    PictureSelectorFragment.this.mAdapter.notifyDataSetChanged();
                }
            }, SELECT_ANIM_DURATION);
        } else {
            this.mAdapter.notifyItemPositionChanged(localMedia.position);
        }
        if (z4) {
            return;
        }
        sendChangeSubSelectPositionEvent(true);
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@o0 View view, @q0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        reStartSavedInstance(bundle);
        this.isMemoryRecycling = bundle != null;
        this.tvDataEmpty = (TextView) view.findViewById(R.id.tv_data_empty);
        this.completeSelectView = (CompleteSelectView) view.findViewById(R.id.ps_complete_select);
        this.titleBar = (TitleBar) view.findViewById(R.id.title_bar);
        this.bottomNarBar = (BottomNavBar) view.findViewById(R.id.bottom_nar_bar);
        this.tvCurrentDataTime = (TextView) view.findViewById(R.id.tv_current_data_time);
        onCreateLoader();
        initAlbumListPopWindow();
        initTitleBar();
        initComplete();
        initRecycler(view);
        initBottomNavBar();
        if (this.isMemoryRecycling) {
            recoverSaveInstanceData();
        } else {
            requestLoadData();
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void reStartSavedInstance(Bundle bundle) {
        if (bundle == null) {
            this.isDisplayCamera = this.selectorConfig.isDisplayCamera;
            return;
        }
        this.allFolderSize = bundle.getInt(ProtectedSandApp.s("ᖜ\u0001"));
        this.mPage = bundle.getInt(ProtectedSandApp.s("ᖝ\u0001"), this.mPage);
        this.currentPosition = bundle.getInt(ProtectedSandApp.s("ᖞ\u0001"), this.currentPosition);
        this.isDisplayCamera = bundle.getBoolean(ProtectedSandApp.s("ᖟ\u0001"), this.selectorConfig.isDisplayCamera);
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void sendChangeSubSelectPositionEvent(boolean z4) {
        if (this.selectorConfig.selectorStyle.getSelectMainStyle().isSelectNumberStyle()) {
            int i4 = 0;
            while (i4 < this.selectorConfig.getSelectCount()) {
                LocalMedia localMedia = this.selectorConfig.getSelectedResult().get(i4);
                i4++;
                localMedia.setNum(i4);
                if (z4) {
                    this.mAdapter.notifyItemPositionChanged(localMedia.position);
                }
            }
        }
    }
}
