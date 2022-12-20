import { useParams } from "react-router-dom";

const ProductDetail = () => {
  // to extract the rout params
  const params = useParams();

  return (
    <section>
      <h1>Product Detail</h1>
      <p>{params.productId}</p>
    </section>
  );
};

export default ProductDetail;
