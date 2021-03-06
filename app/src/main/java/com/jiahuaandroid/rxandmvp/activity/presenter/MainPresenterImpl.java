package com.jiahuaandroid.rxandmvp.activity.presenter;

import android.content.Context;

import com.jiahuaandroid.rxandmvp.activity.module.ApiMoudle;
import com.jiahuaandroid.rxandmvp.activity.view.MainViewImpl;
import com.jiahuaandroid.rxandmvp.core.mvp.ActivityPresenter;
import com.jiahuaandroid.rxandmvp.model.UserListEntity;
import com.jiahuaandroid.rxandmvp.network.DataResponse;

import java.util.ArrayList;
import java.util.List;

import rx.Observable;
import rx.functions.Func1;

/**
 * Created by jhhuang on 2016/9/18.
 * QQ:781913268
 * Description：MainPresenterImpl
 */
public class MainPresenterImpl extends ActivityPresenter<MainViewImpl>
{
    private static final String TAG = "MainPresenterImpl";
    private ApiMoudle mMoudle;

    public MainPresenterImpl()
    {
        mMoudle = new ApiMoudle();
    }

    public void action2second(Context mContext)
    {
        if (isViewAttached())
        {
            getMvpView().action2second();
        }
        mMoudle.getUserList("http://192.168.1.70:9080","3")
                .compose(callbackOnIOThread())
                .map(DataResponse::getData)
                .flatMap(new Func1<List<UserListEntity.DataEntity>, Observable<List<String>>>()
                {
                    @Override
                    public Observable<List<String>> call(List<UserListEntity.DataEntity> dataEntities)
                    {
                        List<String> list = new ArrayList<>();
                        for (UserListEntity.DataEntity dataEntity : dataEntities)
                        {
                            list.add(dataEntity.getRealNameNo());
                        }
                        return Observable.just(list);
                    }
                })
                .compose(verifyOnMainThread())
                .subscribe(new NetSubseriber<List<String>>()
                {
                    @Override
                    public void onNext(List<String> strings)
                    {
                        getMvpView().notifyUserList(strings);
                    }


                })
        ;

    }
}
