import { Route, Routes } from "react-router-dom";

import Welcome from "./pages/Welcome";
import Products from "./pages/Products";
import MainHeader from "./components/MainHeader";
import ProductDetail from "./pages/ProductDetail";

function App() {
  return (
    <div>
      <MainHeader />
      <main>
        <Routes>
          <Route exact path="/welcome" element={<Welcome />} />
          <Route exact path="/products" element={<Products />} />
          <Route
            exact
            path="/products/:productId"
            element={<ProductDetail />}
          />
        </Routes>
      </main>
    </div>
  );
}

export default App;
