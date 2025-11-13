# Casa di Luca – TODO

## 🧩 Phase 1: Foundation Cleanup
- [x] Refactor all filenames, IDs, and resources to neutral names
- [x] Update `colors.xml`, `dimens.xml`, and `strings.xml`
- [x] Clean up layouts (`activity_main`, `menu_container`)
- [x] Fix and simplify `MainActivity.kt` and `MenuAdapter.kt`
- [x] Confirm build success after refactor

---

## 🏠 Phase 2: Home Screen Redesign
- [ ] Create new `HomeActivity` as main entry point
- [ ] Add info icon (“i”) on hero image
- [ ] Create popup layout for “About Casa di Luca”
- [ ] Add text: short description, hours, address
- [ ] Include Instagram / Facebook icons
- [ ] Add close button for popup
- [ ] Create and style overlay cards for “Welcome / News”
- [ ] Connect vertical scroll with overlay cards on Home

---

## 🌐 Phase 2.5: Multi-Language Setup (EN + SV)
- [x] Move all visible text to `strings.xml`
- [x] Create `values-sv/strings.xml` for Swedish translations
- [x] Test automatic locale switching

---

## 🧭 Phase 3: Navigation & Activities
- [ ] Create `MenuActivity` as standalone screen
- [ ] Connect navigation via Intent: Home → Menu
- [ ] Add optional `AboutActivity` for future expansion
- [ ] Remove “Back to menu” button logic
- [ ] Use Android’s system back navigation temporarily
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

---

✅ **Progress tracking:**
Use `[x]` to mark tasks done — keep this file updated as you build!