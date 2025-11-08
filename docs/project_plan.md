# Casa di Luca – Project Plan

_This document tracks the design, structure, and feature development for Casa di Luca._

---

## 🧩 A. Current Structure & Status
- All resource files (colors, dimens, strings) have been refactored and standardized.
- Neutral naming convention implemented (`menu_`, `btn_`, `text_`, etc.).
- All layouts connected and functioning correctly.
- Base design is stable and ready for new visual features.

---

## 🎨 B. Home View Design (v1)

### Hero Section
- Image: Casa di Luca hero
- Title: CASA DI LUCA
- Subtitle: Authentic Italian flavors made with love
- Info icon (“i”) opens popup

### Info Popup
- Title: About Casa di Luca
- Text: A family-owned restaurant focused on genuine Italian cuisine
- Opening hours and address
- Social icons: Instagram, Facebook
- Close button

### Section 1 – News
- Title: Welcome
- Vertical list of overlay cards:
  - Image
  - Title
  - Short description

### Section 2–3 (Future)
- Horizontal scroll sections (e.g. drinks, desserts)
- Potential “Follow us” or “Find us” section

---

## 🪄 C. Visual System
- Colors: `neutral_xxx`, `overlay_20`, `text_primary`, etc.
- Typography: `text_xs–xxl`
- Corners: `radius_m`
- Elevation: `elevation_m` for cards and buttons
- Consistent spacing using dimens for padding and margins

---

## 🗺️ D. Future Ideas
- About section
- Contact or map section
- Events or specials carousel
- Light/dark theme switch

---

## ✅ E. Next Steps
1. Create `overlay_card.xml` layout
2. Design info popup component for the hero section
3. Add scrollable “News” section
4. Integrate social media icons (static links)
5. Begin visual refinement (spacing, shadows, typography)