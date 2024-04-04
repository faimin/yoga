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

enum class Overflow : uint8_t {
  Visible = YGOverflowVisible,
  Hidden = YGOverflowHidden,
  Scroll = YGOverflowScroll,
};

template <>
constexpr int32_t ordinalCount<Overflow>() {
  return 3;
}

constexpr Overflow scopedEnum(YGOverflow unscoped) {
  return static_cast<Overflow>(unscoped);
}

constexpr YGOverflow unscopedEnum(Overflow scoped) {
  return static_cast<YGOverflow>(scoped);
}

inline const char* toString(Overflow e) {
  return YGOverflowToString(unscopedEnum(e));
}

} // namespace facebook::yoga
