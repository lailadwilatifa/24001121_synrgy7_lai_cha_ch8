package com.example.listingmovie.presentation.fragments;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.domain.model.Result;
import com.example.listingmovie.R;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class HomeFragmentDirections {
  private HomeFragmentDirections() {
  }

  @NonNull
  public static ActionHomeFragmentToDetailFragment actionHomeFragmentToDetailFragment(
      @Nullable Result result) {
    return new ActionHomeFragmentToDetailFragment(result);
  }

  @NonNull
  public static NavDirections actionHomeFragmentToProfileFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeFragment_to_profileFragment);
  }

  public static class ActionHomeFragmentToDetailFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionHomeFragmentToDetailFragment(@Nullable Result result) {
      this.arguments.put("result", result);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionHomeFragmentToDetailFragment setResult(@Nullable Result result) {
      this.arguments.put("result", result);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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

    @Override
    public int getActionId() {
      return R.id.action_homeFragment_to_detailFragment;
    }

    @SuppressWarnings("unchecked")
    @Nullable
    public Result getResult() {
      return (Result) arguments.get("result");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionHomeFragmentToDetailFragment that = (ActionHomeFragmentToDetailFragment) object;
      if (arguments.containsKey("result") != that.arguments.containsKey("result")) {
        return false;
      }
      if (getResult() != null ? !getResult().equals(that.getResult()) : that.getResult() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getResult() != null ? getResult().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionHomeFragmentToDetailFragment(actionId=" + getActionId() + "){"
          + "result=" + getResult()
          + "}";
    }
  }
}
