package com.example.listingmovie.presentation.state;

import com.example.domain.model.Result;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/listingmovie/presentation/state/MovieListState;", "", "Error", "Loading", "Success", "Lcom/example/listingmovie/presentation/state/MovieListState$Error;", "Lcom/example/listingmovie/presentation/state/MovieListState$Loading;", "Lcom/example/listingmovie/presentation/state/MovieListState$Success;", "app_debug"})
public abstract interface MovieListState {
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/listingmovie/presentation/state/MovieListState$Error;", "Lcom/example/listingmovie/presentation/state/MovieListState;", "error", "", "(Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "app_debug"})
    public static final class Error implements com.example.listingmovie.presentation.state.MovieListState {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String error = null;
        
        public Error(@org.jetbrains.annotations.NotNull
        java.lang.String error) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getError() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\n\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00d6\u0003J\t\u0010\u0007\u001a\u00020\bH\u00d6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001\u00a8\u0006\u000b"}, d2 = {"Lcom/example/listingmovie/presentation/state/MovieListState$Loading;", "Lcom/example/listingmovie/presentation/state/MovieListState;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Loading implements com.example.listingmovie.presentation.state.MovieListState {
        @org.jetbrains.annotations.NotNull
        public static final com.example.listingmovie.presentation.state.MovieListState.Loading INSTANCE = null;
        
        private Loading() {
            super();
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/listingmovie/presentation/state/MovieListState$Success;", "Lcom/example/listingmovie/presentation/state/MovieListState;", "movieResult", "", "Lcom/example/domain/model/Result;", "(Ljava/util/List;)V", "getMovieResult", "()Ljava/util/List;", "app_debug"})
    public static final class Success implements com.example.listingmovie.presentation.state.MovieListState {
        @org.jetbrains.annotations.NotNull
        private final java.util.List<com.example.domain.model.Result> movieResult = null;
        
        public Success(@org.jetbrains.annotations.NotNull
        java.util.List<com.example.domain.model.Result> movieResult) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.example.domain.model.Result> getMovieResult() {
            return null;
        }
    }
}