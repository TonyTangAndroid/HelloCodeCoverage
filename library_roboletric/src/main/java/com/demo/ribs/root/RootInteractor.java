package com.demo.ribs.root;

import androidx.annotation.Nullable;
import com.demo.ribs.root.RootInteractor.RootPresenter;
import com.uber.rib.core.BasicInteractor;
import com.uber.rib.core.Bundle;
import com.uber.rib.core.RibInteractor;

@RibInteractor
public class RootInteractor extends BasicInteractor<RootPresenter, RootRouter> {

  public RootInteractor(RootPresenter presenter) {
    super(presenter);
  }

  @Override
  protected void didBecomeActive(@Nullable Bundle savedInstanceState) {
    super.didBecomeActive(savedInstanceState);
  }

  interface RootPresenter {}
}
