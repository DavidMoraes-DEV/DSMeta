import "./styles.css";
import icon from '../../assets/img/notification-icon.svg';
import axios from "axios";
import { BASE_URL } from "../../utils/request";

type Props = {
  saleId: number;
};

function NotificationButton({saleId}: Props) {

  function handleClick (saleId: number) {
    axios(`${BASE_URL}/sales/${saleId}/notification`)
    .then(response => {
      console.log("sucesso");
    });
  }

  return (
    <div className="dsmeta-red-btn" onClick={() => handleClick(saleId)}>
      <img src={icon} alt="Notificar" />
    </div>
  );
}

export default NotificationButton;
