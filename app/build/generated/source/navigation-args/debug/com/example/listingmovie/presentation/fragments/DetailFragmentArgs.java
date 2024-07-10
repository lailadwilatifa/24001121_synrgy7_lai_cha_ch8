package com.example.listingmovie.presentation.fragments;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import com.example.domain.model.Result;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class DetailFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private DetailFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private DetailFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static DetailFragmentArgs fromBundle(@NonNull Bundle bundle) {
    DetailFragmentArgs __result = new DetailFragmentArgs();
    bundle.setClassLoader(DetailFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("result")) {
      Result result;
      if (Parcelable.class.isAssignableFrom(Result.class) || Serializable.class.isAssignableFrom(Result.class)) {
        result = (Result) bundle.get("result");
      } else {
        throw new UnsupportedOperationException(Result.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      __result.arguments.put("result", result);
    } else {
      throw new IllegalArgumentException("Required argument \"result\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static DetailFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    DetailFragmentArgs __result = new DetailFragmentArgs();
    if (savedStateHandle.contains("result")) {
      Result result;
      result = savedStateHandle.get("result");
      __result.arguments.put("result", result);
    } else {
      throw new IllegalArgumentException("Required argument \"result\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @Nullable
  public Result getResult() {
    return (Result) arguments.get("result");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("result")) {
      Result result = (Result) arguments.get("result");
      if (Parcelable.class.isAssignableFrom(Result.class) || result == null) {
        __result.putParcelable("result", Parcelable.class.cast(result));
      } else if (Serializable.class.isAssignableFrom(Result.class)) {
        __result.putSerializable("result", Serializable.class.cast(result));
      } else {
        throw new UnsupportedOperationException(Result.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("result")) {
      Result result = (Result) arguments.get("result");
      if (Parcelable.class.isAssignableFrom(Result.class) || result == null) {
        __result.set("result", Parcelable.class.cast(result));
      } else if (Serializable.class.isAssignableFrom(Result.class)) {
        __result.set("result", Serializable.class.cast(result));
      } else {
        throw new UnsupportedOperationException(Result.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    DetailFragmentArgs that = (DetailFragmentArgs) object;
    if (arguments.containsKey("result") != that.arguments.containsKey("result")) {
      return false;
    }
    if (getResult() != null ? !getResult().equals(that.getResult()) : that.getResult() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getResult() != null ? getResult().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "DetailFragmentArgs{"
        + "result=" + getResult()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull DetailFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@Nullable Result result) {
      this.arguments.put("result", result);
    }

    @NonNull
    public DetailFragmentArgs build() {
      DetailFragmentArgs result = new DetailFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setResult(@Nullable Result result) {
      this.arguments.put("result", result);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @Nullable
    public Result getResult() {
      return (Result) arguments.get("result");
    }
  }
}
