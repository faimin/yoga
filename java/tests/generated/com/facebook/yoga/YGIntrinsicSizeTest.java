/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 *
 * @generated SignedSource<<a7ff8df3045dffe162674b23a62e9abf>>
 * generated by gentest/gentest-driver.ts from gentest/fixtures/YGIntrinsicSizeTest.html
 */

package com.facebook.yoga;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import com.facebook.yoga.utils.TestUtils;

@RunWith(Parameterized.class)
public class YGIntrinsicSizeTest {
  @Parameterized.Parameters(name = "{0}")
  public static Iterable<TestParametrization.NodeFactory> nodeFactories() {
    return TestParametrization.nodeFactories();
  }

  @Parameterized.Parameter public TestParametrization.NodeFactory mNodeFactory;

  @Test
  public void test_contains_inner_text_long_word() {
    YogaConfig config = YogaConfigFactory.create();

    final YogaNode root = createNode(config);
    root.setAlignItems(YogaAlign.FLEX_START);
    root.setPositionType(YogaPositionType.ABSOLUTE);
    root.setWidth(2000f);
    root.setHeight(2000f);

    final YogaNode root_child0 = createNode(config);
    root_child0.setFlexDirection(YogaFlexDirection.ROW);
    root.addChildAt(root_child0, 0);
    root_child0.setData("LoremipsumdolorsitametconsecteturadipiscingelitSedeleifasdfettortoracauctorFuscerhoncusipsumtemporerosaliquamconsequatPraesentsoda");
    root_child0.setMeasureFunction(new TestUtils.intrinsicMeasureFunction());
    root.setDirection(YogaDirection.LTR);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(2000f, root.getLayoutWidth(), 0.0f);
    assertEquals(2000f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(1300f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);

    root.setDirection(YogaDirection.RTL);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(2000f, root.getLayoutWidth(), 0.0f);
    assertEquals(2000f, root.getLayoutHeight(), 0.0f);

    assertEquals(700f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(1300f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);
  }

  @Test
  public void test_contains_inner_text_no_width_no_height() {
    YogaConfig config = YogaConfigFactory.create();

    final YogaNode root = createNode(config);
    root.setAlignItems(YogaAlign.FLEX_START);
    root.setPositionType(YogaPositionType.ABSOLUTE);
    root.setWidth(2000f);
    root.setHeight(2000f);

    final YogaNode root_child0 = createNode(config);
    root_child0.setFlexDirection(YogaFlexDirection.ROW);
    root.addChildAt(root_child0, 0);
    root_child0.setData("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed eleifasd et tortor ac auctor. Integer at volutpat libero, sed elementum dui interdum id. Aliquam consectetur massa vel neque aliquet, quis consequat risus fringilla. Fusce rhoncus ipsum tempor eros aliquam, vel tempus metus ullamcorper. Nam at nulla sed tellus vestibulum fringilla vel sit amet ligula. Proin velit lectus, euismod sit amet quam vel ultricies dolor, vitae finibus lorem ipsum. Pellentesque molestie at mi sit amet dictum. Donec vehicula lacinia felis sit amet consectetur. Praesent sodales enim sapien, sed varius ipsum pellentesque vel. Aenean eu mi eu justo tincidunt finibus vel sit amet ipsum. Sed bibasdum purus vel ipsum sagittis, quis fermentum dolor lobortis. Etiam vulputate eleifasd lectus vel varius. Phasellus imperdiet lectus sit amet ipsum egestas, ut bibasdum ipsum malesuada. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Sed mollis eros sit amet elit porttitor, vel venenatis turpis venenatis. Nulla tempus tortor at eros efficitur, sit amet dapibus ipsum malesuada. Ut at mauris sed nunc malesuada convallis. Duis id sem vel magna varius eleifasd vel at est. Donec eget orci a ipsum tempor lobortis. Sed at consectetur ipsum.");
    root_child0.setMeasureFunction(new TestUtils.intrinsicMeasureFunction());
    root.setDirection(YogaDirection.LTR);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(2000f, root.getLayoutWidth(), 0.0f);
    assertEquals(2000f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(2000f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(70f, root_child0.getLayoutHeight(), 0.0f);

    root.setDirection(YogaDirection.RTL);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(2000f, root.getLayoutWidth(), 0.0f);
    assertEquals(2000f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(2000f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(70f, root_child0.getLayoutHeight(), 0.0f);
  }

  @Test
  public void test_contains_inner_text_no_width_no_height_long_word_in_paragraph() {
    YogaConfig config = YogaConfigFactory.create();

    final YogaNode root = createNode(config);
    root.setAlignItems(YogaAlign.FLEX_START);
    root.setPositionType(YogaPositionType.ABSOLUTE);
    root.setWidth(2000f);
    root.setHeight(2000f);

    final YogaNode root_child0 = createNode(config);
    root_child0.setFlexDirection(YogaFlexDirection.ROW);
    root.addChildAt(root_child0, 0);
    root_child0.setData("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed eleifasd et tortor ac auctor. Integer at volutpat libero, sed elementum dui interdum id. Aliquam consectetur massa vel neque aliquet, quis consequat risus fringilla. Fusce rhoncus ipsum tempor eros aliquam, vel tempus metus ullamcorper. Nam at nulla sed tellus vestibulum fringilla vel sit amet ligula. Proin velit lectus, euismod sit amet quam vel ultricies dolor, vitae finibus loremipsumloremipsumloremipsumloremipsumloremipsumloremipsumloremipsumloremipsumloremipsumloremipsumloremipsumloremipsumloremipsumlorem Pellentesque molestie at mi sit amet dictum. Donec vehicula lacinia felis sit amet consectetur. Praesent sodales enim sapien, sed varius ipsum pellentesque vel. Aenean eu mi eu justo tincidunt finibus vel sit amet ipsum. Sed bibasdum purus vel ipsum sagittis, quis fermentum dolor lobortis. Etiam vulputate eleifasd lectus vel varius. Phasellus imperdiet lectus sit amet ipsum egestas, ut bibasdum ipsum malesuada. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Sed mollis eros sit amet elit porttitor, vel venenatis turpis venenatis. Nulla tempus tortor at eros efficitur, sit amet dapibus ipsum malesuada. Ut at mauris sed nunc malesuada convallis. Duis id sem vel magna varius eleifasd vel at est. Donec eget orci a ipsum tempor lobortis. Sed at consectetur ipsum.");
    root_child0.setMeasureFunction(new TestUtils.intrinsicMeasureFunction());
    root.setDirection(YogaDirection.LTR);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(2000f, root.getLayoutWidth(), 0.0f);
    assertEquals(2000f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(2000f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(70f, root_child0.getLayoutHeight(), 0.0f);

    root.setDirection(YogaDirection.RTL);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(2000f, root.getLayoutWidth(), 0.0f);
    assertEquals(2000f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(2000f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(70f, root_child0.getLayoutHeight(), 0.0f);
  }

  @Test
  public void test_contains_inner_text_fixed_width() {
    YogaConfig config = YogaConfigFactory.create();

    final YogaNode root = createNode(config);
    root.setAlignItems(YogaAlign.FLEX_START);
    root.setPositionType(YogaPositionType.ABSOLUTE);
    root.setWidth(2000f);
    root.setHeight(2000f);

    final YogaNode root_child0 = createNode(config);
    root_child0.setFlexDirection(YogaFlexDirection.ROW);
    root_child0.setWidth(100f);
    root.addChildAt(root_child0, 0);
    root_child0.setData("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed eleifasd et tortor ac auctor. Integer at volutpat libero, sed elementum dui interdum id. Aliquam consectetur massa vel neque aliquet, quis consequat risus fringilla. Fusce rhoncus ipsum tempor eros aliquam, vel tempus metus ullamcorper. Nam at nulla sed tellus vestibulum fringilla vel sit amet ligula. Proin velit lectus, euismod sit amet quam vel ultricies dolor, vitae finibus lorem ipsum. Pellentesque molestie at mi sit amet dictum. Donec vehicula lacinia felis sit amet consectetur. Praesent sodales enim sapien, sed varius ipsum pellentesque vel. Aenean eu mi eu justo tincidunt finibus vel sit amet ipsum. Sed bibasdum purus vel ipsum sagittis, quis fermentum dolor lobortis. Etiam vulputate eleifasd lectus vel varius. Phasellus imperdiet lectus sit amet ipsum egestas, ut bibasdum ipsum malesuada. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Sed mollis eros sit amet elit porttitor, vel venenatis turpis venenatis. Nulla tempus tortor at eros efficitur, sit amet dapibus ipsum malesuada. Ut at mauris sed nunc malesuada convallis. Duis id sem vel magna varius eleifasd vel at est. Donec eget orci a ipsum tempor lobortis. Sed at consectetur ipsum.");
    root_child0.setMeasureFunction(new TestUtils.intrinsicMeasureFunction());
    root.setDirection(YogaDirection.LTR);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(2000f, root.getLayoutWidth(), 0.0f);
    assertEquals(2000f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(1290f, root_child0.getLayoutHeight(), 0.0f);

    root.setDirection(YogaDirection.RTL);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(2000f, root.getLayoutWidth(), 0.0f);
    assertEquals(2000f, root.getLayoutHeight(), 0.0f);

    assertEquals(1900f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(1290f, root_child0.getLayoutHeight(), 0.0f);
  }

  @Test
  public void test_contains_inner_text_no_width_fixed_height() {
    YogaConfig config = YogaConfigFactory.create();

    final YogaNode root = createNode(config);
    root.setAlignItems(YogaAlign.FLEX_START);
    root.setPositionType(YogaPositionType.ABSOLUTE);
    root.setWidth(2000f);
    root.setHeight(2000f);

    final YogaNode root_child0 = createNode(config);
    root_child0.setFlexDirection(YogaFlexDirection.ROW);
    root_child0.setHeight(20f);
    root.addChildAt(root_child0, 0);
    root_child0.setData("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed eleifasd et tortor ac auctor. Integer at volutpat libero, sed elementum dui interdum id. Aliquam consectetur massa vel neque aliquet, quis consequat risus fringilla. Fusce rhoncus ipsum tempor eros aliquam, vel tempus metus ullamcorper. Nam at nulla sed tellus vestibulum fringilla vel sit amet ligula. Proin velit lectus, euismod sit amet quam vel ultricies dolor, vitae finibus lorem ipsum. Pellentesque molestie at mi sit amet dictum. Donec vehicula lacinia felis sit amet consectetur. Praesent sodales enim sapien, sed varius ipsum pellentesque vel. Aenean eu mi eu justo tincidunt finibus vel sit amet ipsum. Sed bibasdum purus vel ipsum sagittis, quis fermentum dolor lobortis. Etiam vulputate eleifasd lectus vel varius. Phasellus imperdiet lectus sit amet ipsum egestas, ut bibasdum ipsum malesuada. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Sed mollis eros sit amet elit porttitor, vel venenatis turpis venenatis. Nulla tempus tortor at eros efficitur, sit amet dapibus ipsum malesuada. Ut at mauris sed nunc malesuada convallis. Duis id sem vel magna varius eleifasd vel at est. Donec eget orci a ipsum tempor lobortis. Sed at consectetur ipsum.");
    root_child0.setMeasureFunction(new TestUtils.intrinsicMeasureFunction());
    root.setDirection(YogaDirection.LTR);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(2000f, root.getLayoutWidth(), 0.0f);
    assertEquals(2000f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(2000f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(20f, root_child0.getLayoutHeight(), 0.0f);

    root.setDirection(YogaDirection.RTL);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(2000f, root.getLayoutWidth(), 0.0f);
    assertEquals(2000f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(2000f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(20f, root_child0.getLayoutHeight(), 0.0f);
  }

  @Test
  public void test_contains_inner_text_fixed_width_fixed_height() {
    YogaConfig config = YogaConfigFactory.create();

    final YogaNode root = createNode(config);
    root.setAlignItems(YogaAlign.FLEX_START);
    root.setPositionType(YogaPositionType.ABSOLUTE);
    root.setWidth(2000f);
    root.setHeight(2000f);

    final YogaNode root_child0 = createNode(config);
    root_child0.setFlexDirection(YogaFlexDirection.ROW);
    root_child0.setWidth(50f);
    root_child0.setHeight(20f);
    root.addChildAt(root_child0, 0);
    root_child0.setData("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed eleifasd et tortor ac auctor. Integer at volutpat libero, sed elementum dui interdum id. Aliquam consectetur massa vel neque aliquet, quis consequat risus fringilla. Fusce rhoncus ipsum tempor eros aliquam, vel tempus metus ullamcorper. Nam at nulla sed tellus vestibulum fringilla vel sit amet ligula. Proin velit lectus, euismod sit amet quam vel ultricies dolor, vitae finibus lorem ipsum. Pellentesque molestie at mi sit amet dictum. Donec vehicula lacinia felis sit amet consectetur. Praesent sodales enim sapien, sed varius ipsum pellentesque vel. Aenean eu mi eu justo tincidunt finibus vel sit amet ipsum. Sed bibasdum purus vel ipsum sagittis, quis fermentum dolor lobortis. Etiam vulputate eleifasd lectus vel varius. Phasellus imperdiet lectus sit amet ipsum egestas, ut bibasdum ipsum malesuada. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Sed mollis eros sit amet elit porttitor, vel venenatis turpis venenatis. Nulla tempus tortor at eros efficitur, sit amet dapibus ipsum malesuada. Ut at mauris sed nunc malesuada convallis. Duis id sem vel magna varius eleifasd vel at est. Donec eget orci a ipsum tempor lobortis. Sed at consectetur ipsum.");
    root_child0.setMeasureFunction(new TestUtils.intrinsicMeasureFunction());
    root.setDirection(YogaDirection.LTR);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(2000f, root.getLayoutWidth(), 0.0f);
    assertEquals(2000f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(20f, root_child0.getLayoutHeight(), 0.0f);

    root.setDirection(YogaDirection.RTL);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(2000f, root.getLayoutWidth(), 0.0f);
    assertEquals(2000f, root.getLayoutHeight(), 0.0f);

    assertEquals(1950f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(20f, root_child0.getLayoutHeight(), 0.0f);
  }

  @Test
  public void test_contains_inner_text_max_width_max_height() {
    YogaConfig config = YogaConfigFactory.create();

    final YogaNode root = createNode(config);
    root.setAlignItems(YogaAlign.FLEX_START);
    root.setPositionType(YogaPositionType.ABSOLUTE);
    root.setWidth(2000f);
    root.setHeight(2000f);

    final YogaNode root_child0 = createNode(config);
    root_child0.setFlexDirection(YogaFlexDirection.ROW);
    root_child0.setMaxWidth(50f);
    root_child0.setMaxHeight(20f);
    root.addChildAt(root_child0, 0);
    root_child0.setData("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed eleifasd et tortor ac auctor. Integer at volutpat libero, sed elementum dui interdum id. Aliquam consectetur massa vel neque aliquet, quis consequat risus fringilla. Fusce rhoncus ipsum tempor eros aliquam, vel tempus metus ullamcorper. Nam at nulla sed tellus vestibulum fringilla vel sit amet ligula. Proin velit lectus, euismod sit amet quam vel ultricies dolor, vitae finibus lorem ipsum. Pellentesque molestie at mi sit amet dictum. Donec vehicula lacinia felis sit amet consectetur. Praesent sodales enim sapien, sed varius ipsum pellentesque vel. Aenean eu mi eu justo tincidunt finibus vel sit amet ipsum. Sed bibasdum purus vel ipsum sagittis, quis fermentum dolor lobortis. Etiam vulputate eleifasd lectus vel varius. Phasellus imperdiet lectus sit amet ipsum egestas, ut bibasdum ipsum malesuada. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Sed mollis eros sit amet elit porttitor, vel venenatis turpis venenatis. Nulla tempus tortor at eros efficitur, sit amet dapibus ipsum malesuada. Ut at mauris sed nunc malesuada convallis. Duis id sem vel magna varius eleifasd vel at est. Donec eget orci a ipsum tempor lobortis. Sed at consectetur ipsum.");
    root_child0.setMeasureFunction(new TestUtils.intrinsicMeasureFunction());
    root.setDirection(YogaDirection.LTR);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(2000f, root.getLayoutWidth(), 0.0f);
    assertEquals(2000f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(20f, root_child0.getLayoutHeight(), 0.0f);

    root.setDirection(YogaDirection.RTL);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(2000f, root.getLayoutWidth(), 0.0f);
    assertEquals(2000f, root.getLayoutHeight(), 0.0f);

    assertEquals(1950f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(20f, root_child0.getLayoutHeight(), 0.0f);
  }

  @Test
  public void test_contains_inner_text_max_width() {
    YogaConfig config = YogaConfigFactory.create();

    final YogaNode root = createNode(config);
    root.setAlignItems(YogaAlign.FLEX_START);
    root.setPositionType(YogaPositionType.ABSOLUTE);
    root.setWidth(2000f);
    root.setHeight(2000f);

    final YogaNode root_child0 = createNode(config);
    root_child0.setFlexDirection(YogaFlexDirection.ROW);
    root_child0.setMaxWidth(100f);
    root.addChildAt(root_child0, 0);
    root_child0.setData("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed eleifasd et tortor ac auctor. Integer at volutpat libero, sed elementum dui interdum id. Aliquam consectetur massa vel neque aliquet, quis consequat risus fringilla. Fusce rhoncus ipsum tempor eros aliquam, vel tempus metus ullamcorper. Nam at nulla sed tellus vestibulum fringilla vel sit amet ligula. Proin velit lectus, euismod sit amet quam vel ultricies dolor, vitae finibus lorem ipsum. Pellentesque molestie at mi sit amet dictum. Donec vehicula lacinia felis sit amet consectetur. Praesent sodales enim sapien, sed varius ipsum pellentesque vel. Aenean eu mi eu justo tincidunt finibus vel sit amet ipsum. Sed bibasdum purus vel ipsum sagittis, quis fermentum dolor lobortis. Etiam vulputate eleifasd lectus vel varius. Phasellus imperdiet lectus sit amet ipsum egestas, ut bibasdum ipsum malesuada. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Sed mollis eros sit amet elit porttitor, vel venenatis turpis venenatis. Nulla tempus tortor at eros efficitur, sit amet dapibus ipsum malesuada. Ut at mauris sed nunc malesuada convallis. Duis id sem vel magna varius eleifasd vel at est. Donec eget orci a ipsum tempor lobortis. Sed at consectetur ipsum.");
    root_child0.setMeasureFunction(new TestUtils.intrinsicMeasureFunction());
    root.setDirection(YogaDirection.LTR);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(2000f, root.getLayoutWidth(), 0.0f);
    assertEquals(2000f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(1290f, root_child0.getLayoutHeight(), 0.0f);

    root.setDirection(YogaDirection.RTL);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(2000f, root.getLayoutWidth(), 0.0f);
    assertEquals(2000f, root.getLayoutHeight(), 0.0f);

    assertEquals(1900f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(1290f, root_child0.getLayoutHeight(), 0.0f);
  }

  @Test
  public void test_contains_inner_text_fixed_width_shorter_text() {
    YogaConfig config = YogaConfigFactory.create();

    final YogaNode root = createNode(config);
    root.setAlignItems(YogaAlign.FLEX_START);
    root.setPositionType(YogaPositionType.ABSOLUTE);
    root.setWidth(2000f);
    root.setHeight(2000f);

    final YogaNode root_child0 = createNode(config);
    root_child0.setFlexDirection(YogaFlexDirection.ROW);
    root_child0.setWidth(100f);
    root.addChildAt(root_child0, 0);
    root_child0.setData("Lorem ipsum");
    root_child0.setMeasureFunction(new TestUtils.intrinsicMeasureFunction());
    root.setDirection(YogaDirection.LTR);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(2000f, root.getLayoutWidth(), 0.0f);
    assertEquals(2000f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(20f, root_child0.getLayoutHeight(), 0.0f);

    root.setDirection(YogaDirection.RTL);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(2000f, root.getLayoutWidth(), 0.0f);
    assertEquals(2000f, root.getLayoutHeight(), 0.0f);

    assertEquals(1900f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(20f, root_child0.getLayoutHeight(), 0.0f);
  }

  @Test
  public void test_contains_inner_text_fixed_height_shorter_text() {
    YogaConfig config = YogaConfigFactory.create();

    final YogaNode root = createNode(config);
    root.setAlignItems(YogaAlign.FLEX_START);
    root.setPositionType(YogaPositionType.ABSOLUTE);
    root.setWidth(2000f);
    root.setHeight(2000f);

    final YogaNode root_child0 = createNode(config);
    root_child0.setFlexDirection(YogaFlexDirection.ROW);
    root_child0.setHeight(100f);
    root.addChildAt(root_child0, 0);
    root_child0.setData("Lorem ipsum");
    root_child0.setMeasureFunction(new TestUtils.intrinsicMeasureFunction());
    root.setDirection(YogaDirection.LTR);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(2000f, root.getLayoutWidth(), 0.0f);
    assertEquals(2000f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(110f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(100f, root_child0.getLayoutHeight(), 0.0f);

    root.setDirection(YogaDirection.RTL);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(2000f, root.getLayoutWidth(), 0.0f);
    assertEquals(2000f, root.getLayoutHeight(), 0.0f);

    assertEquals(1890f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(110f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(100f, root_child0.getLayoutHeight(), 0.0f);
  }

  @Test
  public void test_contains_inner_text_max_height() {
    YogaConfig config = YogaConfigFactory.create();

    final YogaNode root = createNode(config);
    root.setAlignItems(YogaAlign.FLEX_START);
    root.setPositionType(YogaPositionType.ABSOLUTE);
    root.setWidth(2000f);
    root.setHeight(2000f);

    final YogaNode root_child0 = createNode(config);
    root_child0.setFlexDirection(YogaFlexDirection.ROW);
    root_child0.setMaxHeight(20f);
    root.addChildAt(root_child0, 0);
    root_child0.setData("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed eleifasd et tortor ac auctor. Integer at volutpat libero, sed elementum dui interdum id. Aliquam consectetur massa vel neque aliquet, quis consequat risus fringilla. Fusce rhoncus ipsum tempor eros aliquam, vel tempus metus ullamcorper. Nam at nulla sed tellus vestibulum fringilla vel sit amet ligula. Proin velit lectus, euismod sit amet quam vel ultricies dolor, vitae finibus lorem ipsum. Pellentesque molestie at mi sit amet dictum. Donec vehicula lacinia felis sit amet consectetur. Praesent sodales enim sapien, sed varius ipsum pellentesque vel. Aenean eu mi eu justo tincidunt finibus vel sit amet ipsum. Sed bibasdum purus vel ipsum sagittis, quis fermentum dolor lobortis. Etiam vulputate eleifasd lectus vel varius. Phasellus imperdiet lectus sit amet ipsum egestas, ut bibasdum ipsum malesuada. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Sed mollis eros sit amet elit porttitor, vel venenatis turpis venenatis. Nulla tempus tortor at eros efficitur, sit amet dapibus ipsum malesuada. Ut at mauris sed nunc malesuada convallis. Duis id sem vel magna varius eleifasd vel at est. Donec eget orci a ipsum tempor lobortis. Sed at consectetur ipsum.");
    root_child0.setMeasureFunction(new TestUtils.intrinsicMeasureFunction());
    root.setDirection(YogaDirection.LTR);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(2000f, root.getLayoutWidth(), 0.0f);
    assertEquals(2000f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(2000f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(20f, root_child0.getLayoutHeight(), 0.0f);

    root.setDirection(YogaDirection.RTL);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(2000f, root.getLayoutWidth(), 0.0f);
    assertEquals(2000f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(2000f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(20f, root_child0.getLayoutHeight(), 0.0f);
  }

  private YogaNode createNode(YogaConfig config) {
    return mNodeFactory.create(config);
  }
}
