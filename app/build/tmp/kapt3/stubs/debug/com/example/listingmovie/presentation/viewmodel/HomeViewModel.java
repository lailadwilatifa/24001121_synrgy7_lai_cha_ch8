package com.example.listingmovie.presentation.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.common.Resource;
import com.example.domain.model.User;
import com.example.domain.usecase.GetMovieNowPlayingUseCase;
import com.example.listingmovie.presentation.state.MovieListState;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/listingmovie/presentation/viewmodel/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "pref", "Lcom/example/data/local/UserDataStoreManager;", "getMovieNowPlayingUseCase", "Lcom/example/domain/usecase/GetMovieNowPlayingUseCase;", "(Lcom/example/data/local/UserDataStoreManager;Lcom/example/domain/usecase/GetMovieNowPlayingUseCase;)V", "_movieListState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/listingmovie/presentation/state/MovieListState;", "movieListState", "Landroidx/lifecycle/LiveData;", "getMovieListState", "()Landroidx/lifecycle/LiveData;", "getMovieNowPlaying", "", "getUser", "Lcom/example/domain/model/User;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.data.local.UserDataStoreManager pref = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.domain.usecase.GetMovieNowPlayingUseCase getMovieNowPlayingUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.example.listingmovie.presentation.state.MovieListState> _movieListState = null;
    
    @javax.inject.Inject
    public HomeViewModel(@org.jetbrains.annotations.NotNull
    com.example.data.local.UserDataStoreManager pref, @org.jetbrains.annotations.NotNull
    com.example.domain.usecase.GetMovieNowPlayingUseCase getMovieNowPlayingUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.listingmovie.presentation.state.MovieListState> getMovieListState() {
        return null;
    }
    
    private final void getMovieNowPlaying() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.domain.model.User> getUser() {
        return null;
    }
}