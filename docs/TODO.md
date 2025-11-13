# Casa di Luca – TODO

## 🧩 Phase 1: Foundation Cleanup
- [x] Refactor all filenames, IDs, and resources to neutral names
- [x] Update `colors.xml`, `dimens.xml`, and `strings.xml`
- [x] Clean up layouts (`activity_main`, `menu_container`)
- [x] Fix and simplify `MainActivity.kt` and `MenuAdapter.kt`
- [x] Confirm build success after refactor

---

## 🏠 Phase 2: Home Screen Redesign
- [x] Create new `HomeActivity` as main entry point
- [x] Add info icon (“i”) on hero image
- [x] Create popup layout for “About Casa di Luca”
- [x] Add text: short description, hours, address
- [x] Include Instagram / Facebook icons
- [x] Add close button for popup
- [x] Create and style overlay cards for “Welcome / News”
- [x] Connect vertical scroll with overlay cards on Home

---

## 🌐 Phase 2.5: Multi-Language Setup (EN + SV)
- [x] Move all visible text to `strings.xml`
- [x] Create `values-sv/strings.xml` for Swedish translations
- [x] Test automatic locale switching

---

## 🧭 Phase 3: Navigation & Activities
- [x] Create `MenuActivity` as standalone screen
- [x] Connect navigation via Intent: Home → Menu
- [ ] Add optional `AboutActivity` for future expansion
- [x] Remove “Back to menu” button logic
- [x] Use Android’s system back navigation temporarily
- [ ] Plan transition to bottom navigation (Home / Menu / About)
- [ ] Add icon + label styling for navigation items

---

## 🎨 Phase 4: Visual & Style Improvements
- [ ] Apply consistent margins and paddings using neutral dimens
- [ ] Add elevation levels to cards and buttons
- [ ] Fine-tune gradients and overlay colors
- [ ] Test color contrast for accessibility
- [ ] Review font sizes and spacing for all screen sizes

---

## 🗺️ Phase 5: About & Future Sections
- [ ] Expand popup into dedicated “About” screen
- [ ] Add map / contact info section
- [ ] Optional: create “Events / Specials” carousel
- [ ] Add “Find us” or “Follow us” social footer

---

## 🧪 Phase 6: Testing & Polish
- [ ] Verify all buttons, layouts, and navigation flows
- [ ] Check all text strings and colors load correctly (EN + SV)
- [ ] Run on multiple screen sizes (small / tablet)
- [ ] Clean unused resources
- [ ] Commit final stable build

## 🧱 Phase 7: Custom Components & Architecture Cleanup
- [ ] Convert `card_container` into a reusable custom view class
- [ ] Convert `popup_container` into `PopupView` class
- [ ] Convert menu buttons into a `MenuCategoryButton` custom view
- [ ] Remove duplicated XML blocks across activities
- [ ] Reduce HomeActivity/MenuActivity code by moving UI logic into views

---

✅ **Progress tracking:**
Use `[x]` to mark tasks done — keep this file updated as you build!