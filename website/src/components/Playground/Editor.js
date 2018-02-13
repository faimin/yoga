/**
 * Copyright (c) 2014-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 *
 * @flow
 * @format
 */

import React, {Component} from 'react';
import {Row, Col, Button, Tabs} from 'antd';
import EditValue from './EditValue';
import type {LayoutRecordT} from './LayoutRecord';
import type {Yoga$Direction} from 'yoga-layout';
import InfoText from './InfoText';
import './Editor.css';
const TabPane = Tabs.TabPane;

type Props = {
  node: ?LayoutRecordT,
  onChangeLayout: (key: string, value: any) => void,
  onChangeSetting: (key: string, value: any) => void,
  direction: Yoga$Direction,
  selectedNodeIsRoot: boolean,
  onRemove?: () => void,
  onAdd?: () => void,
};

export default class Editor extends Component<Props> {
  componentDidMount() {
    document.addEventListener('keydown', this.onKeyDown);
  }

  componentWillUnmount() {
    document.removeEventListener('keydown', this.onKeyDown);
  }

  onKeyDown = (e: KeyboardEvent) => {
    if (
      (e.key === 'Delete' || e.key === 'Backspace') &&
      this.props.onRemove &&
      !(e.target instanceof HTMLInputElement)
    ) {
      this.props.onRemove();
    }
  };

  render() {
    const {node, selectedNodeIsRoot} = this.props;
    const disabled = !Boolean(node);

    return (
      <div className="Editor">
        <Tabs defaultActiveKey="1" className="EditorTabs">
          <TabPane tab="Flex" key="1">
            <h2>
              Direction
              <InfoText doclink="/docs/layout-direction">Defines the direction of which text and items are laid out</InfoText>
            </h2>
            <EditValue
              property="direction"
              value={this.props.direction}
              onChange={this.props.onChangeSetting}
            />
            <h2>
              Flex direction
              <InfoText doclink="/docs/flex-direction">Defines the direction of the main-axis</InfoText>
            </h2>
            <EditValue
              disabled={disabled}
              property="flexDirection"
              value={node ? node.flexDirection : undefined}
              onChange={this.props.onChangeLayout}
            />

            <Row gutter={15} style={{marginTop: 30}}>
              <Col span={12}>
                <h2>
                  Flex grow
                  <InfoText doclink="/docs/flex">The factor of remaining space should be given to this node</InfoText>
                </h2>
                <EditValue
                  type="text"
                  property="flexGrow"
                  disabled={disabled || selectedNodeIsRoot}
                  value={node ? node.flexGrow : undefined}
                  onChange={this.props.onChangeLayout}
                />
              </Col>
              <Col span={12}>
                <h2>
                  Flex shrink
                  <InfoText doclink="/docs/flex">The shrink factor of this element if parent has no space left</InfoText>
                </h2>
                <EditValue
                  type="text"
                  property="flexShrink"
                  disabled={disabled || selectedNodeIsRoot}
                  value={node ? node.flexShrink : undefined}
                  onChange={this.props.onChangeLayout}
                />
              </Col>
            </Row>

            <h2>
              Flex wrap
              <InfoText doclink="/docs/flex-wrap">Wrapping behaviour when child nodes don't fit into a single line</InfoText>
            </h2>
            <EditValue
              disabled={disabled}
              property="flexWrap"
              value={node ? node.flexWrap : undefined}
              onChange={this.props.onChangeLayout}
            />
          </TabPane>
          <TabPane tab="Alignment" key="2">
            <h2>
              Justify content
              <InfoText doclink="/docs/justify-content">Aligns child nodes along the main-axis</InfoText>
            </h2>
            <EditValue
              disabled={disabled}
              property="justifyContent"
              value={node ? node.justifyContent : undefined}
              onChange={this.props.onChangeLayout}
            />

            <h2>
              Align items
              <InfoText doclink="/docs/align-items">Aligns child nodes along the cross-axis</InfoText>
            </h2>
            <EditValue
              disabled={disabled}
              property="alignItems"
              value={node ? node.alignItems : undefined}
              onChange={this.props.onChangeLayout}
            />

            <h2>
              Align self
              <InfoText doclink="/docs/align-items">Override align items of parent</InfoText>
            </h2>
            <EditValue
              disabled={disabled || selectedNodeIsRoot}
              property="alignSelf"
              value={node ? node.alignSelf : undefined}
              onChange={this.props.onChangeLayout}
            />

            <h2>
              Align content
              <InfoText doclink="/docs/align-content">Alignment of lines along the cross-axis when wrapping</InfoText>
            </h2>
            <EditValue
              disabled={disabled}
              property="alignContent"
              value={node ? node.alignContent : undefined}
              onChange={this.props.onChangeLayout}
            />
          </TabPane>
          <TabPane tab="Layout" key="3">
            <h2>
              Width &times; height
              <InfoText doclink="/docs/width-height">Dimensions of the node</InfoText>
            </h2>
            <Row gutter={15}>
              <Col span={12}>
                <EditValue
                  type="text"
                  placeholder="width"
                  property="width"
                  disabled={disabled}
                  value={node ? node.width : undefined}
                  onChange={this.props.onChangeLayout}
                />
              </Col>
              <Col span={12}>
                <EditValue
                  type="text"
                  placeholder="height"
                  property="height"
                  disabled={disabled}
                  value={node ? node.height : undefined}
                  onChange={this.props.onChangeLayout}
                />
              </Col>
            </Row>

            <h2>
              Aspect ratio
              <InfoText doclink="/docs/aspect-ratio">Width/Height aspect ratio of node</InfoText>
            </h2>
            <EditValue
              type="text"
              placeholder="Aspect ratio"
              property="aspectRatio"
              disabled={disabled}
              value={node ? node.aspectRatio : undefined}
              onChange={this.props.onChangeLayout}
            />

            <h2>Box model</h2>
            {['padding', 'border', 'margin'].map(property => (
              <EditValue
                property={property}
                key={property}
                value={node ? node[property] : undefined}
                onChange={this.props.onChangeLayout}
              />
            ))}
            <h2>
              Position
              <InfoText doclink="/docs/absolute-position">
                Relative position offsets the node from it's calculated
                position. Absolute position removes the node from the flexbox
                flow and positions it at the given position.
              </InfoText>
            </h2>

            <EditValue
              disabled={disabled}
              property="positionType"
              value={node ? node.positionType : undefined}
              onChange={this.props.onChangeLayout}
            />
            <EditValue
              property="position"
              value={node ? node.position : undefined}
              onChange={this.props.onChangeLayout}
            />
          </TabPane>
        </Tabs>

        <Row gutter={15} className="EditorButtons">
          <Col span={12}>
            <Button
              icon="plus-circle-o"
              disabled={!Boolean(this.props.onAdd)}
              onClick={this.props.onAdd}
              type="primary">
              add child node
            </Button>
          </Col>
          <Col span={12}>
            <Button
              icon="close-circle-o"
              disabled={!Boolean(this.props.onRemove)}
              onClick={this.props.onRemove}
              type="danger">
              remove node
            </Button>
          </Col>
        </Row>
      </div>
    );
  }
}
