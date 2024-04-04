/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

// @generated by enums.py
// clang-format off
#pragma once

#include <cstdint>
#include <ZDYoga/YGEnums.h>
#include <ZDYoga/enums/YogaEnums.h>

namespace facebook::yoga {

enum class Display : uint8_t {
  Flex = YGDisplayFlex,
  None = YGDisplayNone,
};

template <>
constexpr int32_t ordinalCount<Display>() {
  return 2;
}

constexpr Display scopedEnum(YGDisplay unscoped) {
  return static_cast<Display>(unscoped);
}

constexpr YGDisplay unscopedEnum(Display scoped) {
  return static_cast<YGDisplay>(scoped);
}

inline const char* toString(Display e) {
  return YGDisplayToString(unscopedEnum(e));
}

} // namespace facebook::yoga
