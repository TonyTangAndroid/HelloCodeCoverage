package com.demo.lib1;

import static com.google.common.truth.Truth.assertThat;

import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.test.core.app.ApplicationProvider;
import com.demo.ribs.root.RootRouter;
import com.demo.ribs.root.RootScope;
import motif.ScopeFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class RootScopeTest {

  @Test
  public void whenViewAttached_shouldFindText() {
    RootRouter rootRouter = scope().rootRouter();
    TextView tv_view = (TextView) rootRouter.getView().findViewById(R.id.tv_root);
    assertThat(tv_view.getText()).isEqualTo("I am the Root");
  }

  private static RootScope scope() {
    return ScopeFactory.create(RootScope.class, RootScopeTest::parentViewGroup);
  }

  private static FrameLayout parentViewGroup() {
    return new FrameLayout(ApplicationProvider.getApplicationContext());
  }
}
