import { Link } from "react-router-dom";
import BookModel from "../../models/BookModel";

export const CheckoutAndReviewBox: React.FC<{ book: BookModel | undefined, mobile: boolean }> = (props) => {


    return (
        <div className={props.mobile ? 'card d-flex mt-5' : 'card col-3 container d-flex mb-5'}>
            <div className='card-body container'>
                <div className='mt-3'>
                    <p>
                        <b>0/5</b>
                        貸与中
                    </p>
                    <hr />
                    {props.book && props.book.copiesAvailable && props.book.copiesAvailable > 0 ?
                        <h4 className='text-success'>
                            貸与可能
                        </h4>
                        :
                        <h4 className='text-danger'>
                            控えリスト
                        </h4>
                    }
                    <div className='row'>
                        <p className='col-6 lead'>
                            <b>{props.book?.copies}</b>
                            冊
                        </p>
                        <p className='col-6 lead'>
                            <b>{props.book?.copiesAvailable}</b>
                            貸与可能
                        </p>
                    </div>
                </div>
                <Link to='/#' className='btn btn-success btn-lg'>ログイン</Link>
                <hr />
                <p className='mt-3'>
                    貸与確定まで利用可能な冊数が変わる場合があります。
                </p>
                <p>
                    会員登録してレビューを残してください！
                </p>
            </div>
        </div>
    );
}